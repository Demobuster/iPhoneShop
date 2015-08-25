<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>

        <%@ page import="java.util.Locale, java.util.ResourceBundle" %>
        <%@ include file="styles/headerStyle.css" %>

    </head>

    <body>
        <%
            Locale locale = Locale.getDefault();
            ResourceBundle myres;

            String url = request.getParameter("url");
            String lang = request.getParameter("lang");
            String sessionLang = (String) session.getAttribute("lang");

            if (lang != null) {
                    if (lang.equals("ru")) {
                        locale = new Locale("ru", "RU");
                        session.setAttribute("lang", "ru");
                    } else if (lang.equals("fr")) {
                        locale = new Locale("fr", "FR");
                        session.setAttribute("lang", "fr");
                    } else if (lang.equals("en")) {
                        locale = new Locale("en", "US");
                        session.setAttribute("lang", "en");
                    }
                } 
            
           System.out.println("headerLine.jsp: request[" + lang + "], session[" + sessionLang + "]\n");
   

            myres = ResourceBundle.getBundle("myres", locale);
        %>
        
        <c:if test="${ param.redir eq 'redirect' }">
            <c:redirect url="http://localhost:8080/iPhoneShop/userPage.jsp?lang=${ sessionScope.lang}"/>
        </c:if>
        
        <c:if test="${ sessionScope.userValidation ne 'valid' }">
            <c:if test="${ param.state ne 'off' }">
                <a href="http://localhost:8080/iPhoneShop/authorizeCheck" class="pages"><%= myres.getString("enter")%></a>
            </c:if>
        </c:if>

        <div class="menu">
            <c:if test="${ not empty sessionScope.phonesRequestLine }">
                <c:if test="${ param.state ne 'off' }">
                    <a href="http://localhost:8080/iPhoneShop/CartServlet" class="cart"><%= myres.getString("cart")%></a>
                </c:if>
            </c:if>

            <c:if test="${ sessionScope.userValidation eq 'valid' }">
                <a href="http://localhost:8080/iPhoneShop/authorizeCheck?exitCommand=invalidate" class="exit"><%= myres.getString("exit")%></a>

                <div class="userInfo">
                    <a href="http://localhost:8080/iPhoneShop/userPage.jsp?lang=${ sessionScope.lang}" 
                       class="userPage"><c:out value="User: ${ sessionScope.username }"></c:out></a>
                    </div>

                <c:if test="${ param.isOrderOn eq 'on' }">
                    <c:if test="${ not empty sessionScope.phonesRequestLine  }">
                        <a href="delivery.jsp" class="history"><%= myres.getString("order")%></a>
                    </c:if>
                </c:if>	

            </c:if>	

        </div>

        <div class="langIcon" id="RU">
            <form action="<%= url %>">
                <input type="hidden" name="lang" value="ru">
                <input type="hidden" name="name" value="${ param.name }">
                <button class="ru"> </button>
            </form>
        </div>

        <div class="langIcon" id="EN">
            <form action="<%= url %>">
                <input type="hidden" name="lang" value="en">
                <input type="hidden" name="name" value="${ param.name }">
                <button class="en"> </button>
            </form>
        </div>

        <div class="langIcon" id="FR">
            <form action="<%= url %>" >
                <input type="hidden" name="lang" value="fr">
                <input type="hidden" name="name" value="${ param.name }">
                <button class="fr"> </button>
            </form>
        </div>

    </body>
</html>