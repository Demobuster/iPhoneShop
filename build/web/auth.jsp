<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome!</title>

<%@ include file="styles/loginStyle.css" %>

</head>
<body>
    <c:import url="headerLine.jsp">
	<c:param name="lang" value="${ param.lang }"/>
	<c:param name="url" value="auth.jsp"/>
        <c:param name="state" value="off"/>
    </c:import>
    
    <c:if test="${ param.lang eq 'ru' ||  sessionScope.lang eq 'ru'}">
        <fmt:setLocale value="ru_RU"/>
        
    </c:if>
    <c:if test="${ param.lang eq 'en' ||  sessionScope.lang eq 'en' }">
        <fmt:setLocale value="en_US"/>
        
    </c:if>
    <c:if test="${ param.lang eq 'fr' ||  sessionScope.lang eq 'fr' }">
        <fmt:setLocale value="fr_FR"/>
       
    </c:if>
	
    <fmt:setBundle basename="myres" />

    <div class="welcome">
        <center><fmt:message key="welcome"/></center>
        <hr>
    </div>

    <div class="loginForm">

        <form action="j_security_check" method="post" >
            <input type="text" name="j_username" size="25" > <br><br>
            <input type="password" name="j_password" size="26" > <br>
            <input type="hidden" name="lang" value="${ lang }" > <br>
            <p><p>

            <input type="submit" value="<fmt:message key="enter"/>">

        </form>

    </div>

</body>
</html>