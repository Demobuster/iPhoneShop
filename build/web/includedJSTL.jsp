<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<style>
input[type=submit] {
color: #fff; /* цвет текста */
text-decoration: none; /* убирать подчёркивание у ссылок */
user-select: none; /* убирать выделение текста */
background:  rgb(232,95,76); /* фон кнопки */
padding: 15px 35px; /* отступ от текста */
outline: none; /* убирать контур в Mozilla */
font-family: Helvetica_Light-Normal;
position: relative;
top: 45px;
left: 39%;
font-size:30px;
border: 0px;
}

input[type=submit]:hover {
background: #FFE2E2; 			/* при наведении курсора мышки */
}

input[type=submit]:active { 
background: rgb(152,15,0); 		/* при нажатии */
} 

input[type=submit]:focus { 
outline:0;
} 

.price {
font-size: 0.2em;
}
</style>

<script type="text/javascript">
function isNumber(number) {
	if (number == 0)
		return true;
	else
		return (((number / number) && (number >= 0)) ? true : false);
}

function calc(id) {	
	// получаем ссылку на элемент input (кол-во товара)
	var count = document.getElementById(id + "_count");
	// получаем ссылку на элемент input (цена товара)
	var price = document.getElementById(id + "_price");
	// получаем ссылку на элемент span (результат)
	var result = document.getElementById(id + "_result");
	
	var min = 1;							// можно купить минимум 1,
	var max = 100;							// максимум 100
	
	
	if (isNumber(count.value) && document.getElementById(id + "_count").value != "") {
		var temp = 0;
		
		if (document.getElementById(id + "_count").value > 100) {
			document.getElementById(id + "_count").value = max;
			temp = parseInt("100") * parseInt(price.value);	
		} else {		
			temp = parseInt(count.value) * parseInt(price.value);
		}
			
		result.innerHTML = temp;
		document.getElementById("final_" + id).value = temp;
		
		document.getElementById(id).submit();
	} else {
		document.getElementById(id + "_count").value = min;
		document.getElementById("final_" + id).value = document.getElementById(id + "_price").value;
		result.innerHTML = price;		
		
		document.getElementById(id).submit();
	}
}
</script>

<c:set var="name" value="${ param.name }" />
<c:set var="phonePrice" value="${ param.phonePrice }" />


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
	
<div class="table" >
	<div class="picture" > 
		<img src="${ param.picURL }" height=234 width=118 />
		<a href="iPhonePage.jsp?name=${ name }"> </a>
	</div>
				
	<ul class="description" >
			<li>LTE:   <c:out value="${ param.LTE }" />
			<li>	
			<li>Display:   <c:out value=" ${ param.display }" />
	</ul>
			   
	<form action="http://localhost:8080/iPhoneShop/CartServlet" >
		<input type="hidden" name="phoneToDelete" value="${ name }">
		<input type="submit" value="<fmt:message key="delete"/>" />
	</form>		   
	
	<div class="numItemsField">
		<form action="http://localhost:8080/iPhoneShop/CartServlet" id="${ name }" > 
			<input type="text" id="${ name }_count" name="number" value="${ param.number }" onchange="calc('${ name }')" />
			<input type="hidden" id="${ name }_price" value="${ param.price }" onchange="calc('${ name }')" />
			<div class="price"><p><span id="${ name }_result"> </span> </p></div>
			<input type="hidden" id="final_${ name }" name="finPrice" />
			<input type="hidden" name="name" value="${ name }" />
		</form>
		
		<c:if test="${ param.number eq '1' }">
			<c:out value=" ${ param.price }RUB" />
		</c:if>
		
		<c:if test="${ param.number ne '1' }">
			<c:out value=" ${ param.finalPrice }RUB" />
		</c:if>
		
	</div>
</div>
