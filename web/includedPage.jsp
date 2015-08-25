<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.*, java.util.ResourceBundle, java.text.* " %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<style type="text/css">

.numItemsField {
position: relative;
left: 610px;
top: 110px;
}

.finalPrice {
position: relative;
left: 520px;
top: 90px;
font-size: 7em;
}

</style>

</head>
<body>
	<%
        String lang = request.getParameter("lang");
        String name = request.getParameter("name");
	String state = request.getParameter("state");
	Locale locale = (Locale) session.getAttribute("locale");
	ResourceBundle myres;
	
	myres = ResourceBundle.getBundle("myres", locale);
	Currency currency = Currency.getInstance(locale);
	%>
	
	<div class="table" >
		<div class="picture" > 
		
			<img src="<%= request.getParameter("picURL") %>" height=234 width=118 />
		</div>
				
		<ul class="description" >
				<li>LTE:   <%= request.getParameter("LTE") %>
				<li>
				<li>Display:    <%= request.getParameter("display") %> 
		</ul>

                                <%
                                System.out.println("includedPage.jsp: request[" + request.getParameter("lang"));
                                
                                %>
                
		<form action='iPhonesList.jsp' >
			<input type="submit" value='<%= myres.getString("purchaseButton") %>'
				onmouseover="this.value ='<%= myres.getString(request.getParameter("name") + "Price") + currency.getCurrencyCode() %>'" 
				onmouseout="this.value ='<%= myres.getString("purchaseButton") %>'">
			<input type="hidden" name="phone" value=<%= request.getParameter("name") %> >
			<input type="hidden" name="lang" value=<%= request.getParameter("lang") %> >
		</form>
               
                
		<%
		if (state.equals("itemsList")) {
		%>	
                <a href="iPhonePage.jsp?lang=<%= lang%>&name=<%= name %>"
			   class="more"> <%= myres.getString("moreButton") %> </a>
		<%
		}
		%>	   
	</div>	

</body>
</html>