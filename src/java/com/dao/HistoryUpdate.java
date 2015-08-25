package com.dao;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HistoryUpdate extends HttpServlet {
    protected void processRequestPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        HttpSession session = request.getSession(true);
        String phonesRequestLine = (String)session.getAttribute("phonesRequestLine");
	StringTokenizer tok = new StringTokenizer(phonesRequestLine);
        String lang = request.getParameter("lang");
        String user = "tomcat";
        String market = request.getParameter("market");
        String state = request.getParameter("state");
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        Date d = new Date();
        ArrayList<String> historyList = new ArrayList<String>();
               
        while (tok.hasMoreElements()) {
            String product = tok.nextToken();
            
            if (!product.equals("null")) {
                HistoryDAO.persist(new History((int)(Math.random() * 30000), user, product, format.format(d), market));
            }
            
            session.setAttribute("phonesRequestLine", "");
            session.setAttribute("summary", "0");
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
        
         System.out.println("hupdate: request[" + request.getParameter("lang") + "], session[" + (String)session.getAttribute("lang") + "]\n");

        RequestDispatcher dispatcher = request.getRequestDispatcher("userPage.jsp?lang=" + lang);
	dispatcher.forward(request, response);
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