package com.hometask;

import com.dao.*;
import java.io.IOException;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthorizeHandle extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession(true);

        String defaultTab = getInitParameter("defaultTab");
        session.setAttribute("defaultTab", defaultTab);
        String lang = (String) session.getAttribute("lang");
        String redirect = "iPhonesList.jsp?lang=" + lang;

        String username = request.getUserPrincipal().getName();
        String exitCommand = request.getParameter("exitCommand");

        if (username != null) {
            if (username.equals("tomcat")) {
                session.setAttribute("userValidation", "valid");
                session.setAttribute("username", username);
            }
        }

        String user = "tomcat";

        ArrayList<String> commentsList = new ArrayList<String>();
        ArrayList<String> historyList = new ArrayList<String>();

        List list = HistoryDAO.getAllByUser(user);

        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            History current = (History) iterator.next();

            historyList.add("#" + current.getId() + ": " + current.getBuydate() + "   " + current.getProduct() + "   " + current.getAddress());
        }

        String bufferHistory[] = new String[historyList.size()];

        for (int i = 0; i < historyList.size(); ++i) {
            bufferHistory[i] = historyList.get(i);
        }

        session.setAttribute("historyList", historyList);

        list = CommDAO.getAllByUser(user);

        if (list != null) {
            for (Iterator iterator = list.iterator(); iterator.hasNext();) {
                Comments current = (Comments) iterator.next();

                commentsList.add(current.getDate() + ':' + current.getUser() + "->" + current.getComment());
            }
        }

        String bufferComments[] = new String[commentsList.size()];

        for (int i = 0; i < commentsList.size(); ++i) {
            bufferComments[i] = commentsList.get(i);
        }

        session.setAttribute("commentsList", commentsList);

        if (exitCommand != null) {
            if (exitCommand.equals("invalidate")) {
                //String temp = (String) session.getAttribute("lang");
                session.invalidate();

                //HttpSession newSession = request.getSession(true);
                //session.setAttribute("lang", temp);
            }
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(redirect);
        dispatcher.forward(request, response);
    }
}
