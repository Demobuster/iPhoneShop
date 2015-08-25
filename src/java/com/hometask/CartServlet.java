package com.hometask;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class CartServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		HttpSession session = request.getSession(true); 						// ��� �������� ������� ������ ������������� ����� true
                request.setCharacterEncoding("UTF-8");
                response.setCharacterEncoding("UTF-8");
                
		String phoneToDelete = request.getParameter("phoneToDelete");
		String currentName = request.getParameter("name");								// �������� ������
		String newPrice = request.getParameter("finPrice");								// �������� ���� ������
		String number = request.getParameter("number");									// ���������� ������
		String phonesRequestLine = (String)session.getAttribute("phonesRequestLine");
               StringTokenizer tok = null;
                    
		iPhonePageBean[] iPhones = (iPhonePageBean[]) session.getAttribute("iPhones");
		int summary = 0;																// �������� ���� �������
		boolean isNew = true;
                
                 if (phonesRequestLine != null) {
                    phonesRequestLine = rebuildStringWithException(phonesRequestLine, "null");
                    tok = new StringTokenizer(phonesRequestLine);
                }
		
		if (currentName != null && newPrice != null && number != null) 
			if (isNumber(Integer.parseInt(number)) && isNumber(Integer.parseInt(newPrice))) {
				for (int i = 0; i < iPhones.length; ++i)
					if (iPhones[i].getName().equals(currentName)) {
						iPhones[i].setNumber(number);
						iPhones[i].setFinalPrice(newPrice);
					
						break;
					}
			}
		
		for (int i = 0; i < iPhones.length; ++i)
			if (!iPhones[i].getNumber().equals("0")) {
				isNew = false;
				
				break;
			}
		
		if (isNew) {
			while(tok.hasMoreElements()) {
				String temp = tok.nextToken();
			
				for (int i = 0; i < iPhones.length; ++i)
					if (iPhones[i].getName().equals(temp)) {
						iPhones[i].setNumber("1");
						summary += iPhones[i].getPrice();
					}
			}
		} else {
			for (int i = 0; i < iPhones.length; ++i) {
				summary += (Integer.parseInt(iPhones[i].getNumber()) * iPhones[i].getPrice());
			}
		}
	
		////////////////////////////////////////////////////////////////////////
		
		if (phoneToDelete != null && phonesRequestLine != null) {
			phonesRequestLine = rebuildStringWithException(phonesRequestLine, phoneToDelete);
			
			int tempID = idOfSpecPhone(iPhones, phoneToDelete);
			
			if (tempID >= 0) {
				summary = summary - (iPhones[tempID].getPrice() * Integer.parseInt(iPhones[tempID].getNumber()));
			}
			
			iPhones[tempID].setNumber("0");
			
			session.setAttribute("phonesRequestLine", phonesRequestLine);
		}
		
		
		session.setAttribute("summary", summary);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("cart.jsp?lang=" + (String)session.getAttribute("lang"));
		dispatcher.forward(request, response);

	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		doGet(request, response);
	}
	private boolean isNumber(int number) {
		if (number == 0)
			return true;
		else
			return (((number / number) == 1 && number >= 0) ? true : false);
	}
	private String rebuildStringWithException(String stringToRebuild, String exception) {
		String tempResult = "";
		StringTokenizer tok = new StringTokenizer(stringToRebuild);
		
		while(tok.hasMoreElements()) {
			String tempTok = tok.nextToken();
		
			if (!tempTok.equals(exception)) {
				tempResult += tempTok;
				tempResult += " ";
			}
		}
		
		return tempResult;
	}
	private int idOfSpecPhone(iPhonePageBean[] iPhones, String specName) {
		int id = -1;
		
		for (int i = 0; i < iPhones.length; ++i)
			if (iPhones[i].getName().equals(specName)) {
				id = i;
				
				break;
			}
		
		return id;
	}
}









