<%@page import="com.hometask.iPhonePageBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title><%=request.getParameter("name")%></title>


<%@ page import="java.util.Locale,java.util.ResourceBundle, java.text.* " %>
<%@ include file="styles/iPhonePageStyle.css" %>

<script type="text/javascript">

var tabLinks = new Array();
var contentDivs = new Array();

function init() {		
  
  var tabListItems = document.getElementById('tabs').childNodes;
  for ( var i = 0; i < tabListItems.length; i++ ) {
    if ( tabListItems[i].nodeName == "LI" ) {
      var tabLink = getFirstChildWithTagName( tabListItems[i], 'A' );
      var id = getHash( tabLink.getAttribute('href') );
      tabLinks[id] = tabLink;
      contentDivs[id] = document.getElementById( id );
    }
  }
 
  var i = 0;

  for ( var id in tabLinks ) {
    tabLinks[id].onclick = showTab;
    tabLinks[id].onfocus = function() { this.blur() };
    if ( i == <%= getServletContext().getInitParameter("defaultTab") %> ) tabLinks[id].className = 'selected';
    i++;
  }

  var i = 0;

  for ( var id in contentDivs ) {
    if ( i != <%= getServletContext().getInitParameter("defaultTab") %> ) contentDivs[id].className = 'tabContent hide';
    i++;
  }
}

function showTab() {					
  var selectedId = getHash( this.getAttribute('href') );

  // Highlight the selected tab, and dim all others. Also show the selected content div, and hide all others.
  for ( var id in contentDivs ) {
    if ( id == selectedId ) {
      tabLinks[id].className = 'selected';
      contentDivs[id].className = 'tabContent';
    } else {
      tabLinks[id].className = '';
      contentDivs[id].className = 'tabContent hide';
    }
  }

  // Stop the browser following the link
  return false;
}

function getFirstChildWithTagName( element, tagName ) {			
  for ( var i = 0; i < element.childNodes.length; i++ ) {
    if ( element.childNodes[i].nodeName == tagName ) return element.childNodes[i];
  }
}

function getHash( url ) {				
  var hashPos = url.lastIndexOf ( '#' );
  return url.substring( hashPos + 1 );
}
 </script>

</head>
<body onload="init()">
    
    <c:import url="headerLine.jsp">
	<c:param name="lang" value="${ param.lang }"/>
	<c:param name="url" value="iPhonePage.jsp"/>
    </c:import>

    <%
        String lang = request.getParameter("lang");
        Locale locale = Locale.getDefault();
        ResourceBundle myres;
        
        System.out.println("iPhonePage.jsp: lang request - " + request.getParameter("lang") + ", session: " + (String)session.getAttribute("lang"));
    
        if (lang != null) {
            if (lang.equals("ru")) {
                locale = new Locale("ru", "RU");
            } else if (lang.equals("fr")) {
                locale = new Locale("fr", "FR");
            } else if (lang.equals("en")) {
                locale = new Locale("en", "US");
            }
        } 

        myres = ResourceBundle.getBundle("myres", locale);
        java.util.Currency currency = java.util.Currency.getInstance(locale);
        com.hometask.iPhonePageBean iPhone = new com.hometask.iPhonePageBean();

        String name = request.getParameter("name");
        
        //System.out.println("iPhonePage.jsp: request - " + request.getParameter("name") + ", session: " + (String)session.getAttribute("name"));
        
        iPhone.setName(name);
    %>

    <ul id="tabs">
      <li><a href="#firstTab"><%= myres.getString("firstTab") %></a></li>
      <li><a href="#secondTab"><%= myres.getString("secondTab") %></a></li>
      <li><a href="#thirdTab"><%= myres.getString("thirdTab") %></a></li>
    </ul>

      <div class="tabContent" id="firstTab">
          <div>
              <img src="<%= iPhone.getPicURL()%>" alt="iPhone" width=177 height=356
                   class="leftimg">
              <ul class="opis">
                  <%= myres.getString(name + "Full")%>
                  <form action='iPhonesList.jsp' >
                      <input type="submit" value='<%= myres.getString("purchaseButton")%>'
                             onmouseover="this.value ='<%= myres.getString(request.getParameter("name") + "Price") + currency.getCurrencyCode()%>'" 
                             onmouseout="this.value ='<%= myres.getString("purchaseButton")%>'">
                      <input type="hidden" name="phone" value=<%= request.getParameter("name")%> >
                      <input type="hidden" name="lang" value=<%= request.getParameter("lang")%> >
                  </form>
          </div>
      </div>
	
    <div class="tabContent" id="secondTab">
		<ul class="opis">
        	<%= myres.getString(name + "Short") %>
		</div>
    </div>

    <div class="tabContent" id="thirdTab">
      <div>
    
      </div>
    </div>
  </body>
</html>
