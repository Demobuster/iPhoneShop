package com.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CommUpdate extends HttpServlet {

    protected void processRequestPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        HttpSession session = request.getSession(true);
        String user = "tomcat";
        String comment = request.getParameter("message");
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        Date d = new Date();
        ArrayList<String> commentsList = new ArrayList<String>();
        ArrayList<String> historyList = new ArrayList<String>();
        PrintWriter out = response.getWriter();
        

        if (comment != null) {
            Random r = new Random();
            CommDAO.persist(new Comments(r.nextInt(), user, comment, format.format(d)));

            out.print(format.format(d) + ':' + user + "->" + comment);
        }

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
        //session.setAttribute("historyListSize", historyList.size());

        list = CommDAO.getAllByUser(user);

        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            Comments current = (Comments) iterator.next();

            commentsList.add(current.getDate() + ':' + current.getUser() + "->" + current.getComment());
        }

        String bufferComments[] = new String[commentsList.size()];

        for (int i = 0; i < commentsList.size(); ++i) {
            bufferComments[i] = commentsList.get(i);
        }

        session.setAttribute("commentsList", commentsList);
        //session.setAttribute("commentsListSize", commentsList.size());

       //RequestDispatcher dispatcher = request.getRequestDispatcher("userPage.jsp");
        //dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequestPut(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequestPut(request, response);
    }
}
