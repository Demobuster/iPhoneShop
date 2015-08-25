<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="styles/loginStyle.css" %>

<style type="text/css">
    .history {
        font-family: Helvetica_Light-Normal;
        font-size: 1.8em;
        position: absolute;
        top:350px;
        
    }
    .info {
        position: relative;
        top:150px;
        left: 50px;
    }
    .defaultTab {
        position: relative;
        top:100px;
        left:400px;
        font-size: 2em;
    }

    .inputText {
        position: absolute;
        left:900px;
        top:120px;
    }    
    
    .butt {
        position: absolute;
        left:350px;
        top:60px;   
    }
    .comments {
        font-family: Helvetica_Light-Normal;
        font-size: 1.3em;
        position: absolute;
        top:250px;
        left:700px;
        word-wrap: break-word;
        width: 600px;
    }
    .timeAndDate{
        font-family: Helvetica_Light-Normal;
        font-size: 1.3em;
        position: absolute;
        top:110px;
        left:25px;
    }
</style>

<script>
function clock() {
var d = new Date();
var month_num = d.getMonth()
var day = d.getDate();
var hours = d.getHours();
var minutes = d.getMinutes();
var seconds = d.getSeconds();

if (day <= 9) day = "0" + day;
if (hours <= 9) hours = "0" + hours;
if (minutes <= 9) minutes = "0" + minutes;
if (seconds <= 9) seconds = "0" + seconds;

date_time = day + "." + month_num + "." + d.getFullYear() + ", " + hours + ":" + minutes + ":" + seconds;
if (document.layers) {
 document.layers.doc_time.document.write(date_time);
 document.layers.doc_time.document.close();
}
else document.getElementById("doc_time").innerHTML = date_time;
 setTimeout("clock()", 1000);
}

function loadXMLDoc() {
    var xmlhttp;
    
    if (window.XMLHttpRequest)
        // code for IE7+, Firefox, Chrome, Opera, Safari
        xmlhttp=new XMLHttpRequest();
    else // code for IE6, IE5
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    
    xmlhttp.onreadystatechange=function() {
        if (xmlhttp.readyState==4 && xmlhttp.status==200)
        // Action to do
    
        document.getElementById("RESULT").innerHTML += xmlhttp.responseText + "<br>";
        //document.getElementById("RESULT").innerHTML += (document.getElementById("inputComment").value);
    }

    xmlhttp.open("GET", "/iPhoneShop/CommUpdate?message=" + document.getElementById("inputComment").value, true);
    xmlhttp.send();
    
    flushText();
}

function flushText() {
    document.getElementById("inputComment").value = "";
}

</script>
</head>

<body onload="clock()">
    <%
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
    %>
    
    <c:set var="lang" value="${ param.lang }" />  
    
    <c:if test="${ param.lang == null } ">
        <c:set var="lang" value="${ sessionScope.lang }" />
    </c:if>
        
    <c:import url="styles/includedJSTLStyle.css" />
    <c:import url="headerLine.jsp">
	<c:param name="lang" value="${ lang }"/>
	<c:param name="url" value="userPage.jsp"/>
    </c:import>
    
    <c:if test="${ empty sessionScope.lang } ">
        <fmt:setLocale value="ru_RU" />
    </c:if>

        <c:if test="${ param.lang eq 'ru'}">
            <fmt:setLocale value="ru_RU"/>
            <c:set var="lang" value="${ param.lang }" scope="session" />  
        </c:if>
        <c:if test="${ param.lang eq 'en' }">
            <fmt:setLocale value="en_US"/>
            <c:set var="lang" value="${ param.lang }" scope="session" />
        </c:if>
        <c:if test="${ param.lang eq 'fr' }">
            <fmt:setLocale value="fr_FR"/>
            <c:set var="lang" value="${ param.lang }" scope="session" />
        </c:if>
        
        <%
        System.out.println("userPage.jsp: request " + request.getParameter("lang") + " session " + (String)session.getAttribute("lang"));
        %>

    <fmt:setBundle basename="myres" />
    
    <span id="doc_time" class="timeAndDate">
	Дата и время
	</span>
    
    <div class="info">
        <h1><c:out value="${ sessionScope.username }"></c:out></h1>
            <img src="images/default-avatar.png"  />
    </div>    
            
    <div class="history">
        <c:forEach var="i" begin="0" end="${ sessionScope.historyList.size() - 1}" >
            ${ sessionScope.historyList.get(i) }
            <hr>
            <br>
        </c:forEach>
    </div>                        
                        
    <div id="RESULT" class="comments">
        <c:forEach var="i" begin="0" end="${ sessionScope.commentsList.size() - 1}" >
            ${ sessionScope.commentsList.get(i) }
             <br>
        </c:forEach>      
    </div>    
            
    <div class="inputText" >
        <textarea id="inputComment" rows="5" cols="40" ></textarea> 

        <button class="butt" onclick="loadXMLDoc(); " >OK</button>  
    </div>
            
    <div class="defaultTabInfo">
        <%= getServletContext().getInitParameter("defaultTab") %>
    </div>

</body>
</html>