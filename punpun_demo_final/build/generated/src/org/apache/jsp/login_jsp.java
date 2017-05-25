package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Punpun.com เว็บไซต์การระดมทุนจากมวลชลแบบแจกแจงรายการ</title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- Place favicon.ico in the root directory -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/logo/gift.png\"/>\n");
      out.write("        <!-- Animation CSS File. \"Please, Don't Touch it\" - Ice -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/vendor.css\">\n");
      out.write("        <!-- Custom CSS. Bootstrap 4 already there. -->\n");
      out.write("        <link href=\"assets/css/app_vistor.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"auth\">\n");
      out.write("            <div class=\"auth-container\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <header class=\"auth-header\">\n");
      out.write("                        <h1 class=\"auth-title\"> ลงชื่อเข้าใช้ </h1>\n");
      out.write("                    </header>\n");
      out.write("                    <div class=\"auth-content\">\n");
      out.write("                        <form id=\"login-form\" action=\"loginServlet\" method=\"GET\" novalidate=\"\">\n");
      out.write("                            <div class=\"form-group\"> <label for=\"username\">ชื่อผู้ใช้</label> <input type=\"text\" class=\"form-control underlined\" name=\"username\" id=\"username\" placeholder=\"ชื่อผู้ใช้ของคุณ\" required> </div>\n");
      out.write("                            <div class=\"form-group\"> <label for=\"password\">รหัสผ่าน</label> <input type=\"password\" class=\"form-control underlined\" name=\"password\" id=\"password\" placeholder=\"รหัสผ่านของคุณ\" required> </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"remember\">\n");
      out.write("                                    <input class=\"checkbox\" id=\"remember\" type=\"checkbox\">\n");
      out.write("                                    <span>จำฉันไว้</span>\n");
      out.write("                                </label> <a href=\"forgot-password.html\" class=\"forgot-btn pull-right\">ลืมรหัสผ่าน?</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\"> <button type=\"submit\" class=\"btn btn-block btn-primary\">ลงชื่อเข้าใช้</button></div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <p class=\"text-muted text-xs-center\">ไม่มีบัญชีผู้ใช้? <a href=\"signup.html\">สมัครเลยที่นี่!</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"text-xs-center\">\n");
      out.write("                    <a href=\"javascript:history.back()\" class=\"btn btn-secondary rounded btn-sm\"> <i class=\"fa fa-arrow-left\"></i> กลับไปหน้าก่อน </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Script -->\n");
      out.write("        <script src=\"assets/js/vendor.js\"></script>\n");
      out.write("        <script src=\"assets/js/app.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}
