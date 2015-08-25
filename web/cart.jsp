<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Cart</title>
</head>
	
<body>
	<c:import url="styles/includedJSTLStyle.css" />
	<c:import url="headerLine.jsp">
		<c:param name="lang" value="${ param.lang }" />
                 <c:param name="isOrderOn" value="on"/>                              
		<c:param name="url" value="cart.jsp"/>
	</c:import>
	
	<c:if test="${ empty sessionScope.lang } ">
		<fmt:setLocale value="ru_RU" />
	</c:if>

	<c:if test="${ param.lang eq 'ru' ||  sessionScope.lang eq 'ru'}">
		<fmt:setLocale value="ru_RU"/>
                <c:set var="lang" value="${ param.lang }" scope="session" />  
	</c:if>
	<c:if test="${ param.lang eq 'en' ||  sessionScope.lang eq 'en' }">
		<fmt:setLocale value="en_US"/>
                <c:set var="lang" value="${ param.lang }" scope="session" />
	</c:if>
	<c:if test="${ param.lang eq 'fr' ||  sessionScope.lang eq 'fr' }">
		<fmt:setLocale value="fr_FR"/>
                <c:set var="lang" value="${ param.lang }" scope="session" />
	</c:if>
	
	<fmt:setBundle basename="myres" />
	
	<c:set var="phonesRequestLine" value="${ sessionScope.phonesRequestLine }" />
	
	<c:forTokens items="${ phonesRequestLine }" delims=" " var="token">
		<c:forEach var="i" begin="0" end="4" >
			<c:if test="${ token eq iPhones[i].name }">
				<c:import url="includedJSTL.jsp">
					<c:param name="name" value="${ iPhones[i].name }" />
					<c:param name="picURL" value="${ iPhones[i].picURL }" />
					<c:param name="LTE" value="${ iPhones[i].LTE }" />
					<c:param name="display" value="${ iPhones[i].display }" />
					<c:param name="price" value="${ iPhones[i].price }" />
					<c:param name="finalPrice" value="${ iPhones[i].finalPrice }" />
					<c:param name="number" value="${ iPhones[i].number }" />
                                        <c:param name="lang" value="${ sessionScope.lang }" />
				</c:import>
			</c:if>
		</c:forEach>		
	</c:forTokens>
	
	<div class="filter">
		<c:out value=" ${ sessionScope.summary }RUB" />
	</div>

	
</body>
</html>