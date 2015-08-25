package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hometask.iPhonePageBean;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.servlet.http.Cookie;

public final class iPhonesList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/styles/itemPageStyle.css");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_setBundle_basename_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_setBundle_basename_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_setBundle_basename_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; UTF-8;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>      \r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; UTF-8\">\r\n");
      out.write("<title>Shop iPhone</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\" media=\"screen\">\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("top: -20px;\n");
      out.write("left: 10px;\n");
      out.write("font-family: Helvetica_Light-Normal;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("margin: 10px;\n");
      out.write("padding: 0;\n");
      out.write("font-family: Helvetica_Light-Normal;\n");
      out.write("font-size: .7em;\n");
      out.write("background: #FFE2E2;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("color: #fff; /* ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("text-decoration: none; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("user-select: none; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("background:  rgb(232,95,76); /* ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("padding: 15px 35px; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("outline: none; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ Mozilla */\n");
      out.write("font-family: Helvetica_Light-Normal;\n");
      out.write("position: relative;\n");
      out.write("top: 45px;\n");
      out.write("left: 39%;\n");
      out.write("font-size:30px;\n");
      out.write("border: 0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("background: #FFE2E2; \t\t\t/* ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:active { \n");
      out.write("background: rgb(152,15,0); \t\t/* ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("} \n");
      out.write("\n");
      out.write("input[type=submit]:focus { \n");
      out.write("outline:0;\n");
      out.write("} \n");
      out.write("\n");
      out.write("a.purchase {\n");
      out.write("color: #fff; /* ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("text-decoration: none; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("user-select: none; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("background:  rgb(232,95,76); /* ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("padding: 15px 35px; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("outline: none; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ Mozilla */\n");
      out.write("position: relative;\n");
      out.write("top: 35px;\n");
      out.write("left: 90%;\n");
      out.write("font-size:30px;\n");
      out.write("border-radius:  5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a.purchase:hover { \n");
      out.write("background: #FFE2E2; \t\t\t/* ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("} \n");
      out.write("\n");
      out.write("a.purchase:active { \n");
      out.write("background: rgb(152,15,0); \t\t/* ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("} \n");
      out.write("\n");
      out.write("a.more {\n");
      out.write("color: #fff; /* ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("text-decoration: none; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("user-select: none; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("background:  rgb(232,95,76); /* ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("padding: 15px 35px; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("outline: none; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ Mozilla */\n");
      out.write("position: relative;\n");
      out.write("top: 100px;\n");
      out.write("left: 39%;\n");
      out.write("font-size:30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a.more:hover { \n");
      out.write("background: #FFE2E2; \t\t\t/* ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("} \n");
      out.write("\n");
      out.write("a.more:active { \n");
      out.write("background: rgb(152,15,0); \t\t/* ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("} \n");
      out.write("\n");
      out.write("a.enter {\n");
      out.write("color: #fff; /* ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("text-decoration: none; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("user-select: none; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("background:  rgb(232,95,76); /* ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("padding: 7px 7px; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("outline: none; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ Mozilla */\n");
      out.write("position: relative;\n");
      out.write("top: 0px;\n");
      out.write("left: 21%;\n");
      out.write("font-size: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a.enter:hover { \n");
      out.write("background: #FFE2E2; \t\t\t/* ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("} \n");
      out.write("\n");
      out.write("a.enter:active { \n");
      out.write("background: rgb(152,15,0); \t\t/* ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("} \n");
      out.write("\n");
      out.write("a.history {\n");
      out.write("color: #fff; /* ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("text-decoration: none; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("user-select: none; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("background:  rgb(232,95,76); /* ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("padding: 7px 7px; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("outline: none; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ Mozilla */\n");
      out.write("position: relative;\n");
      out.write("top: 0px;\n");
      out.write("left: 715px;\n");
      out.write("font-size:12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a.history:hover { \n");
      out.write("background: #FFE2E2; \t\t\t/* ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("} \n");
      out.write("\n");
      out.write("a.history:active { \n");
      out.write("background: rgb(152,15,0); \t\t/* ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("} \n");
      out.write("\n");
      out.write("a.cart {\n");
      out.write("color: #fff; /* ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("text-decoration: none; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("user-select: none; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("background:  rgb(232,95,76); /* ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("padding: 6px 6px; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("outline: none; /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ Mozilla */\n");
      out.write("position: relative;\n");
      out.write("top: 0px;\n");
      out.write("left: 700px;\n");
      out.write("font-size:12x;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a.cart:hover { \n");
      out.write("background: #FFE2E2; \t\t\t/* ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("} \n");
      out.write("\n");
      out.write("a.cart:active { \n");
      out.write("background: rgb(152,15,0); \t\t/* ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ */\n");
      out.write("} \n");
      out.write("\n");
      out.write("button {\n");
      out.write("border: 0px;\n");
      out.write("}\t\n");
      out.write("\n");
      out.write(".table {\n");
      out.write("width: 900px;\n");
      out.write("height: 300px;\n");
      out.write("background: #ccc;\n");
      out.write("float: left;\n");
      out.write("margin-left: 15px;\n");
      out.write("margin-top: 110px;\n");
      out.write("margin-bottom: -100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".filter {\n");
      out.write("width: 250px;\n");
      out.write("height: 200px;\n");
      out.write("float:right;\n");
      out.write("left: 1000px;\n");
      out.write("position: fixed;\n");
      out.write("background: #ccc;\n");
      out.write("margin-top: 110px;\n");
      out.write("margin-bottom: -100px;\n");
      out.write("opacity: 0.7;\n");
      out.write("padding: 30px;\n");
      out.write("z-index: 101;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".picture {\n");
      out.write("float: left;\n");
      out.write("background: #ccc;\n");
      out.write("position: relative;\n");
      out.write("left: 10px;\n");
      out.write("top: 0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".description {\n");
      out.write("background: #ccc;\n");
      out.write("float: left;\n");
      out.write("left: 250px;\n");
      out.write("top: 10px;\n");
      out.write("font-size:25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>");
      out.write("\r\n");
      out.write("\r\n");

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function offsetPosition(e) { // отступ от верхнего края экрана до элемента\r\n");
      out.write("  var offsetTop = 0;\r\n");
      out.write("  \r\n");
      out.write("  do {\r\n");
      out.write("\t  offsetTop  += e.offsetTop;\r\n");
      out.write("  } while (e = e.offsetParent);\r\n");
      out.write("  \r\n");
      out.write("      return offsetTop;\r\n");
      out.write("}\r\n");
      out.write("var aside = document.querySelector('aside'),\r\n");
      out.write("    OP = offsetPosition(aside);\r\n");
      out.write("\twindow.onscroll = function() {\r\n");
      out.write("  \t\taside.className = (OP < window.pageYOffset ? 'sticky' : ''); \r\n");
      out.write("  // если значение прокрутки больше отступа от верхнего края экрана до элемента, то элементу присваивается класс sticky\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");

     if (request.getParameter("phone") != null) {
            session.setAttribute("phonesRequestLine", (String) session.getAttribute("phonesRequestLine") + " " + request.getParameter("phone"));
            session.setAttribute("orderAbility", "y");
        }  
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerLine.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("state", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("allItems", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("isOrderOn", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("off", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("url", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("iPhonesList.jsp", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("lang", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ param.lang }", java.lang.String.class, (PageContext)_jspx_page_context, null), request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");
      if (_jspx_meth_fmt_setBundle_0(_jspx_page_context))
        return;
      out.write("  \r\n");
      out.write("    ");

          

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
   
    
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    <div class=\"filter\">\r\n");
      out.write("        <form action=\"iPhonesList.jsp\" >\r\n");
      out.write("            ");

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
            
      out.write("\r\n");
      out.write("            LTE:\r\n");
      out.write("            <input type=\"radio\" name=\"LTE\" value=\"on\" ");
      out.print( checkedOn);
      out.write(" >On\r\n");
      out.write("            <input type=\"radio\" name=\"LTE\" value=\"off\" ");
      out.print( checkedOff);
      out.write(" >Off<Br>\r\n");
      out.write("            Display:  \r\n");
      out.write("            <input type=\"checkbox\" name=\"display\"\r\n");
      out.write("                   value=\"4.0\" ");
      out.print( checkedDisplay[0]);
      out.write(" >\r\n");
      out.write("            4.0\"  |\r\n");
      out.write("            <input type=\"checkbox\" name=\"display\"\r\n");
      out.write("                   value=\"4.7\" ");
      out.print( checkedDisplay[1]);
      out.write(" >\r\n");
      out.write("            4.7\" |\r\n");
      out.write("            <input type=\"checkbox\" name=\"display\"\r\n");
      out.write("                   value=\"5.5\" ");
      out.print( checkedDisplay[2]);
      out.write(" >\r\n");
      out.write("            5.5\"\r\n");
      out.write("            <input type=\"hidden\" name=\"lang\" value=");
      out.print( lang);
      out.write(" >\r\n");
      out.write("            <center>\r\n");
      out.write("                <input type=\"submit\" value=\"OK\" >\r\n");
      out.write("            </center>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");

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
    
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includedPage.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("lang", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf( lang ), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("name", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf( iPhones[i].getName()), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("picURL", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf( iPhones[i].getPicURL()), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("LTE", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf( iPhones[i].getLTE()), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("display", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf( iPhones[i].getDisplay()), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("price", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf( iPhones[i].getPrice()), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("state", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("itemsList", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("url", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("cart.jsp", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("    ");

            }
        }
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_setBundle_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:setBundle
    org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag _jspx_th_fmt_setBundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag) _jspx_tagPool_fmt_setBundle_basename_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag.class);
    _jspx_th_fmt_setBundle_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_setBundle_0.setParent(null);
    _jspx_th_fmt_setBundle_0.setBasename("myres");
    int _jspx_eval_fmt_setBundle_0 = _jspx_th_fmt_setBundle_0.doStartTag();
    if (_jspx_th_fmt_setBundle_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_setBundle_basename_nobody.reuse(_jspx_th_fmt_setBundle_0);
      return true;
    }
    _jspx_tagPool_fmt_setBundle_basename_nobody.reuse(_jspx_th_fmt_setBundle_0);
    return false;
  }
}
