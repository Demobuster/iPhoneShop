<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>      
<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<title>Shop iPhone</title>

<%@ page import="com.hometask.iPhonePageBean" %>
<%@ page import="java.util.Locale, java.util.ResourceBundle, javax.servlet.http.Cookie" %>
<%@ include file="styles/itemPageStyle.css" %>

<%
    iPhonePageBean iPhones[] = new iPhonePageBean[5];

    for (int i = 0; i < iPhones.length; ++i) {
        iPhones[i] = new iPhonePageBean();
    }

    iPhones[0].setName("iPhone5");
    iPhones[1].setName("iPhone5C");
    iPhones[2].setName("iPhone5S");
    iPhones[3].setName("iPhone6");
    iPhones[4].setName("iPhone6Plus");

    session.setAttribute("iPhones", iPhones);
    session.setAttribute("summary", "0");
    session.setAttribute("defaultTab", "0");
%>

<script>
function offsetPosition(e) { // отступ от верхнего края экрана до элемента
  var offsetTop = 0;
  
  do {
	  offsetTop  += e.offsetTop;
  } while (e = e.offsetParent);
  
      return offsetTop;
}
var aside = document.querySelector('aside'),
    OP = offsetPosition(aside);
	window.onscroll = function() {
  		aside.className = (OP < window.pageYOffset ? 'sticky' : ''); 
  // если значение прокрутки больше отступа от верхнего края экрана до элемента, то элементу присваивается класс sticky
}
</script>

</head>
<body>
    <%
     if (request.getParameter("phone") != null) {
            session.setAttribute("phonesRequestLine", (String) session.getAttribute("phonesRequestLine") + " " + request.getParameter("phone"));
            session.setAttribute("orderAbility", "y");
        }  
    %>
    
    <jsp:include page="headerLine.jsp">
        <jsp:param name="state" value="allItems"  />
        <jsp:param name="isOrderOn" value="off"  />
        <jsp:param name="url" value="iPhonesList.jsp"  />
        <jsp:param name="lang" value="${ param.lang }"  />
    </jsp:include>
    
    <fmt:setBundle basename="myres" />  
    <%
          

        String lang = request.getParameter("lang");
        String LTE = request.getParameter("LTE");
        String[] display = request.getParameterValues("display");

        Locale locale = Locale.getDefault();

        if (lang != null) {
            if (lang.equals("ru")) {
                locale = new Locale("ru", "RU");
            } else if (lang.equals("fr")) {
                locale = new Locale("fr", "FR");
            } else if (lang.equals("en")) {
                locale = new Locale("en", "US");
            }
            
            session.setAttribute("lang", lang);
        } else if (((String)session.getAttribute("lang")) != null) {
            String temp = (String)session.getAttribute("lang");
            if (temp.equals("ru")) {
                locale = new Locale("ru", "RU");
            } else if (temp.equals("fr")) {
                locale = new Locale("fr", "FR");
            } else if (temp.equals("en")) {
                locale = new Locale("en", "US");
            }
        }
        
        session.setAttribute("locale", locale);

        System.out.println("iPhonesList.jsp: request[" + lang + "], session[" + (String)session.getAttribute("lang") + "]\n");
   
    %>  

    <div class="filter">
        <form action="iPhonesList.jsp" >
            <%
                String checkedOn = "";
                String checkedOff = "";
                String[] checkedDisplay = {"", "", ""};

                if (LTE != null) {
                    if (LTE.equals("on")) {
                        checkedOn = "checked";
                    } else if (LTE.equals("off")) {
                        checkedOff = "checked";
                    }
                }

                if (display != null) {
                    for (int i = 0; i < display.length; ++i) {
                        if (display[i].equals("4.0")) {
                            checkedDisplay[0] = "checked";
                        } else if (display[i].equals("4.7")) {
                            checkedDisplay[1] = "checked";
                        } else if (display[i].equals("5.5")) {
                            checkedDisplay[2] = "checked";
                        }
                    }
                }

                    // чтение
                if (LTE == null && display == null) {
                    if (lang == null) {
                        Cookie[] readCookies = request.getCookies();

                        if (readCookies != null) {
                            display = new String[3];
                            Cookie cookie;
                            int c = 0, d = 0;

                            for (int i = 0; i < readCookies.length; ++i) {
                                cookie = readCookies[i];

                                if (cookie.getName().equals("LTE")) {
                                    LTE = cookie.getValue();
                                } else if (cookie.getName().equals("display" + d) && cookie.getValue().length() == 3) {
                                    display[d] = cookie.getValue();
                                    ++d;
                                } else if (cookie.getName().equals("checkedDisplay" + c)) {
                                    checkedDisplay[c] = cookie.getValue();
                                    ++c;
                                } else if (cookie.getName().equals("checkedOn")) {
                                    checkedOn = cookie.getValue();
                                } else if (cookie.getName().equals("checkedOff")) {
                                    checkedOff = cookie.getValue();
                                }
                            }
                        } else {
                            display = new String[3];

                            display[0] = "4.0";
                            display[1] = "4.7";
                            display[2] = "5.5";
                        }
                    }
                }
            %>
            LTE:
            <input type="radio" name="LTE" value="on" <%= checkedOn%> >On
            <input type="radio" name="LTE" value="off" <%= checkedOff%> >Off<Br>
            Display:  
            <input type="checkbox" name="display"
                   value="4.0" <%= checkedDisplay[0]%> >
            4.0"  |
            <input type="checkbox" name="display"
                   value="4.7" <%= checkedDisplay[1]%> >
            4.7" |
            <input type="checkbox" name="display"
                   value="5.5" <%= checkedDisplay[2]%> >
            5.5"
            <input type="hidden" name="lang" value=<%= lang%> >
            <center>
                <input type="submit" value="OK" >
            </center>
        </form>
    </div>

    <%
            // заполнение

        Cookie checkedOnCookie = new Cookie("checkedOn", checkedOn);
        Cookie checkedOffCookie = new Cookie("checkedOff", checkedOff);

        checkedOnCookie.setMaxAge(60);	// минута
        checkedOffCookie.setMaxAge(60);
        response.addCookie(checkedOnCookie);
        response.addCookie(checkedOffCookie);

        for (int i = 0; i < checkedDisplay.length; ++i) {
            if (checkedDisplay[i] != null) {
                Cookie checkedDisplayCookie = new Cookie("checkedDisplay" + i, checkedDisplay[i]);
                checkedDisplayCookie.setMaxAge(60); 		// минута
                response.addCookie(checkedDisplayCookie);
            }
        }

        if (LTE == null) // LTE
        {
            LTE = "";
        } else {
            Cookie cookieLTE = new Cookie("LTE", LTE);
            cookieLTE.setMaxAge(60); 		// минута
            response.addCookie(cookieLTE);
        }

        if (display == null) {														// DISPLAY
            display = new String[3];

            display[0] = "4.0";
            display[1] = "4.7";
            display[2] = "5.5";
        } else {
            // сначала нужно очистить старые куки!
            Cookie[] setCookies = request.getCookies();		// нужно для установки цикла на длину предыдущего кол-ва записей кук
            if (setCookies != null) {
                for (int i = 0; i < setCookies.length; ++i) {
                    Cookie cookieDisplay = new Cookie("display" + i, "");
                    cookieDisplay.setMaxAge(0); 		// 0 - значит стереть куку
                    response.addCookie(cookieDisplay);
                }
            }

                    // теперь можно заполнять новыми
            for (int i = 0; i < display.length; ++i) {
                if (display[i] != null) {
                    Cookie cookieDisplay = new Cookie("display" + i, display[i]);
                    cookieDisplay.setMaxAge(60); 		// минута
                    response.addCookie(cookieDisplay);
                }
            }
        }

        int id = 0;

        for (int i = 0; i < iPhones.length; ++i) {
            boolean isGoodLTE = false;
            boolean isGoodDisplay = false;

            if (LTE.equals(iPhones[i].getLTE()) || LTE.equals("")) {
                isGoodLTE = true;
            }

            for (int k = 0; k < display.length; ++k) {
                if (display[k] != null) {
                    if (display[k].equals(iPhones[i].getDisplay()) || display[k].equals("")) {
                        isGoodDisplay = true;

                        break;
                    }
                }
            }

            if (isGoodLTE && isGoodDisplay) {
    %>
    <jsp:include page="includedPage.jsp">
        <jsp:param name="lang" value="<%= lang %>"  />
        <jsp:param name="name" value="<%= iPhones[i].getName()%>"  />
        <jsp:param name="picURL" value="<%= iPhones[i].getPicURL()%>" />
        <jsp:param name="LTE" value="<%= iPhones[i].getLTE()%>" />
        <jsp:param name="display" value="<%= iPhones[i].getDisplay()%>" />
        <jsp:param name="price" value="<%= iPhones[i].getPrice()%>" />
        <jsp:param name="state" value="itemsList" />
        <jsp:param name="url" value="cart.jsp" />
    </jsp:include>
    <%
            }
        }
    %>

</body>
</html>