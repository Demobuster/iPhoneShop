<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style type="text/css">
            html { height: 100% }
            body { height: 100%; margin: 0; padding: 0; background: #FFE2E2; }
            h1 { font-family: Helvetica_Light-Normal; font-size: 4em; padding: 0; }
            #map_canvas { height: 100% }
        </style>
        <script type="text/javascript"
            src="http://maps.google.com/maps/api/js?sensor=false">
        </script>
    <script type="text/javascript">
      function initialize() {     
		var shopOne = new google.maps.LatLng(59.991217, 30.318919);
		var shopTwo = new google.maps.LatLng(59.972179, 30.323461);
		
		var myOptions = {
			zoom: 12,
			center: shopTwo,
			mapTypeId: google.maps.MapTypeId.ROADMAP
		}
		var map = new google.maps.Map(document.getElementById("map_canvas"), myOptions); 
		
		var contentStringShopOne = '<div id="content">iPort</div>';
		var contentStringShopTwo = '<div id="content">Apple-Zone</div>';
		
		var infowindowShopOne = new google.maps.InfoWindow({
			content: contentStringShopOne
		});
		var infowindowShopTwo = new google.maps.InfoWindow({
			content: contentStringShopTwo
		});
		
		var markerShopOne = new google.maps.Marker({
			position: shopOne,
			map: map,
			title: 'iPort'
		});
		var markerShopTwo = new google.maps.Marker({
			position: shopTwo,
			map: map,
			title: 'Apple-Zone'
		});
		
		google.maps.event.addListener(markerShopOne, 'click', function() {
                    // infowindowShopOne.open(map, markerShopOne);
                        
                    document.getElementById("1").value = "iPort";
		});
		
		google.maps.event.addListener(markerShopTwo, 'click', function() {
                    // infowindowShopTwo.open(map,markerShopTwo);
                        
                    document.getElementById("1").value = "Apple-Zone";
		});
	}
        
        function checkAddress() {
            if (document.getElementById("1").value == "")
                document.getElementById("1").value = "iPort";
            
        }
	
    </script>
</head>
	
<body onload="initialize()">
    
<c:if test="${ empty sessionScope.lang } ">
		<fmt:setLocale value="ru_RU" />
	</c:if>

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
    
<h1><fmt:message key="deliveryChoose"/></h1>
        
	<c:set var="phonesRequestLine" value="${ sessionScope.phonesRequestLine }" />
    
        <div id="map_canvas" style="width:50%; height:50%; left:150px; top:150px; position:absolute; "></div>
        
        <%
            System.out.println("delivery.jsp: request[" + request.getParameter("lang") + "], session[" + (String)session.getAttribute("lang") + "]\n");
            
            %>
        
        <div class="market" style="left:150px; top:550px; position:absolute; ">
            <form action="http://localhost:8080/iPhoneShop/HistoryUpdate" >
                <input type="text" id="1" size="50" name="market" onchange="checkAddress()" /> 
                <input type="hidden" name="lang" value="${ sessionScope.lang }" />  
		<input type="submit" onclick="checkAddress()" value="ok">
            </form>                                       
        </div>
                
</body>
</html>