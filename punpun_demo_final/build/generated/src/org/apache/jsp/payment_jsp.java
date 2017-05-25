package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("        <!-- Main -->\n");
      out.write("        <div class=\"main-wrapper\">\n");
      out.write("            <div class=\"app\" id=\"app\">\n");
      out.write("\n");
      out.write("                <!--Nav Bar-->\n");
      out.write("                <header class=\"header\">\n");
      out.write("                    <div class=\"brand\">\n");
      out.write("                        <div class=\"image-container logo hidden-xs-down\"> <img src=\"assets/logo/punpun_white.png\" alt=\"Punpun\"> </div>\n");
      out.write("                        <div class=\"image-container logo hidden-sm-up\"style=\"width: 30px; height: 30px;\"> <img src=\"assets/logo/punpun_white.png\" alt=\"Punpun\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"header-block header-block-search hidden-md-down\">\n");
      out.write("                        <form role=\"search\" action=\"\">\n");
      out.write("                            <div class=\"input-container\">\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"fa fa-search\"></i> <input type=\"search\" placeholder=\"...ค้นหาโครงการ...\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"header-block header-block-nav\">\n");
      out.write("                        <ul class=\"nav-profile\">\n");
      out.write("                            <li class=\"header-block header-block-buttons\">\n");
      out.write("                                <a href=\"index.jsp\" class=\"btn btn-none-shadow header-btn\"> <i class=\"fa fa-home\"></i> <span> หน้าแรก </span> </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"header-block header-block-buttons\">\n");
      out.write("                                <a href=\"browse.jsp?category=0&sort=0\" class=\"btn btn-none-shadow header-btn\"> <i class=\"fa fa-file-text\"></i> <span> โครงการต่าง ๆ </span> </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"header-block header-block-buttons\">\n");
      out.write("                                <a href=\"how-it-works.jsp\" class=\"btn btn-none-shadow header-btn\"> <i class=\"fa fa-list-ul\"></i> <span> ขั้นตอนการบริจาค </span> </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"header-block header-block-buttons\">\n");
      out.write("                                <a href=\"dashboard-project-setup-info.jsp\" class=\"btn btn-none-shadow header-btn\"> <i class=\"fa fa-plus\"></i> <span> สร้างโครงการ </span> </a>\n");
      out.write("                            </li>\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </header>\n");
      out.write("                <!-- Header Content -->\n");
      out.write("                <div class=\"app parallax-autoheight white-text\" style=\"background-image: url('assets/backgrounds/profile-card-2.jpg');\" >\n");
      out.write("                    <article class=\"container content-browse items-list-page\">\n");
      out.write("                        <!-- Title -->\n");
      out.write("                        <div class=\"title-block\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <h1 class=\"center-text\"> คุณกำลังบริจาคให้</h1>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <h3 class=\"center-text\"> อุปกรณ์การเรียนแก่เด็กอมก๋อย </h3>\n");
      out.write("                        </div>\n");
      out.write("                    </article>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Content -->\n");
      out.write("                <article class=\"container content dashboard-page\">\n");
      out.write("\n");
      out.write("                    <!--Pill Tab-->\n");
      out.write("                    <section class=\"section\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xl-12 stat-col\">\n");
      out.write("                                <div class=\"card items\">\n");
      out.write("                                    <div class=\"card-block\">\n");
      out.write("                                        <!-- Nav tabs -->\n");
      out.write("                                        <ul class=\"nav nav-pills\">\n");
      out.write("                                            <li class=\"nav-item\"> <a href=\"donate.html\" class=\"nav-link\"> เลือกรายการที่ต้องการช่วยเหลือ </a> </li>\n");
      out.write("                                            <li class=\"nav-item\"> <a href=\"payment.html\" class=\"nav-link active\"> กรอกข้อมูลการชำระเงิน </a> </li>\n");
      out.write("                                            <li class=\"nav-item\"> <a href=\"#\" class=\"nav-link\"> เรียบร้อย </a> </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <!-- Tab panes -->\n");
      out.write("                                        <div class=\"tab-content\">\n");
      out.write("                                            <!--Basic Tab-->\n");
      out.write("                                            <div class=\"tab-pane fade in active\" id=\"basic-pills\">\n");
      out.write("                                                <div class=\"want-top\">\n");
      out.write("                                                    <!-- Payment Method -->\n");
      out.write("                                                    <label class=\"col-xs-5 form-control-label text-xs-right\"> ช่องทางการชำระเงิน : </label>\n");
      out.write("                                                    <ul class=\"nav nav-pills\">\n");
      out.write("                                                        <li class=\"nav-item\"> <a href=\"\" class=\"nav-link payment active\" data-target=\"#bank-transfer-pills\" aria-controls=\"bank-transfer-pills\" data-toggle=\"tab\" role=\"tab\">โอนผ่านบัญชีธนาคาร</a> </li>\n");
      out.write("                                                        <li class=\"nav-item\"> <a href=\"\" class=\"nav-link payment\" data-target=\"#credit-pills\" aria-controls=\"credit-pills\" data-toggle=\"tab\" role=\"tab\">บัตรเครดิต</a> </li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                    <!-- Tab panes -->\n");
      out.write("                                                    <div class=\"tab-content\">\n");
      out.write("                                                        <!--Bank Transfer Tab-->\n");
      out.write("                                                        <div class=\"tab-pane fade in active\" id=\"bank-transfer-pills\">\n");
      out.write("                                                            <div class=\"card card-block\">\n");
      out.write("                                                                <form role=\"form\" method=\"GET\" name=\"bank-transfer\" action=\"payment-processing.html\">\n");
      out.write("                                                                    <div class=\"form-group row\">\n");
      out.write("                                                                        <label class=\"col-sm-2 form-control-label text-xs-right\"> อีเมล : </label>\n");
      out.write("                                                                        <div class=\"col-sm-8\"> <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"อีเมล\" value=\"\"> </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"form-group row\">\n");
      out.write("                                                                        <label class=\"col-sm-2 form-control-label text-xs-right\"> ชื่อ - นามสกุล : </label>\n");
      out.write("                                                                        <div class=\"col-sm-4\"> <input type=\"text\" class=\"form-control\" name=\"firstname\" placeholder=\"ชื่อ\" value=\"\"> </div>\n");
      out.write("                                                                        <div class=\"col-sm-4\"> <input type=\"text\" class=\"form-control\" name=\"lastname\" placeholder=\"นามสกุล\" value=\"\"> </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"form-group row\">\n");
      out.write("                                                                        <label class=\"col-sm-2 form-control-label text-xs-right\"> ที่อยู่ : </label>\n");
      out.write("                                                                        <div class=\"col-sm-8\"> <input type=\"text\" class=\"form-control\" name=\"address\" placeholder=\"ที่อยู่\" value=\"\"> </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"form-group row\">\n");
      out.write("                                                                        <label class=\"col-sm-2 form-control-label text-xs-right\"> ตำบล : </label>\n");
      out.write("                                                                        <div class=\"col-sm-8\"> <input type=\"text\" class=\"form-control\" name=\"sub-district\" placeholder=\"ตำบล\" value=\"\"> </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"form-group row\">\n");
      out.write("                                                                        <label class=\"col-sm-2 form-control-label text-xs-right\"> อำเภอ : </label>\n");
      out.write("                                                                        <div class=\"col-sm-8\"> <input type=\"text\" class=\"form-control\" name=\"district\" placeholder=\"อำเภอ\" value=\"\"> </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"form-group row\">\n");
      out.write("                                                                        <label class=\"col-sm-2 form-control-label text-xs-right\"> จังหวัด : </label>\n");
      out.write("                                                                        <div class=\"col-sm-4\"> <input type=\"text\" class=\"form-control\" name=\"province\" placeholder=\"จังหวัด\" value=\"\"> </div>\n");
      out.write("                                                                        <div class=\"col-sm-4\"> <input type=\"text\" class=\"form-control\" name=\"postal-code\" placeholder=\"รหัสไปรษณีย์\" value=\"\"> </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <!-- Bank -->\n");
      out.write("                                                                    <div class=\"card card-block\">\n");
      out.write("                                                                        <h2>บัญชีธนาคาร</h2>\n");
      out.write("                                                                        <div class=\"card-block col-xs-12 col-sm-6 col-md-4\">\n");
      out.write("                                                                            <div class=\"project-img-container\">\n");
      out.write("                                                                                <div class=\"image-project-no-opacity\" style=\"background-image: url('assets/backgrounds/profile-card-1.jpg')\"></div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                        <div class=\"card-block col-xs-12 col-sm-6 col-md-8\">\n");
      out.write("                                                                            <div class=\"want-top\">\n");
      out.write("                                                                                <h5>ธนาคารไทยพาณิชย์ สาขาสถาบันเทคโนโลยีพระจอมเกล้าเจ้าคุณทหารลาดกระบัง</h5>\n");
      out.write("                                                                                <p>ชื่อบัญชี นางสาวกนกวรรณ มุตตามระ</p>\n");
      out.write("                                                                                <h3>010-0-99999-9</h3>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"card card-block\">\n");
      out.write("                                                                        <div class=\"card-block col-xs-12 col-sm-6 col-md-4\">\n");
      out.write("                                                                            <div class=\"project-img-container\">\n");
      out.write("                                                                                <div class=\"image-project-no-opacity\" style=\"background-image: url('assets/img/scb.jpg')\"></div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                        <div class=\"card-block col-xs-12 col-sm-6 col-md-8\">\n");
      out.write("                                                                            <div class=\"want-top\">\n");
      out.write("                                                                                <h5>ธนาคารกรุงไทย สาขาสถาบันเทคโนโลยีพระจอมเกล้าเจ้าคุณทหารลาดกระบัง</h5>\n");
      out.write("                                                                                <p>ชื่อบัญชี นางสาวกนกวรรณ มุตตามระ</p>\n");
      out.write("                                                                                <h3>060-0-696969-2</h3>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <!--Button-->\n");
      out.write("                                                                    <button type=\"submit\" class=\"btn btn-primary btn-block\"  value=\"Submit\"> <i class=\"fa fa-lock\"> </i> ยืนยันการชำระเงิน </button>\n");
      out.write("                                                                    <input type=\"submit\" class=\"btn btn-secondary btn-block\"  value=\"Cancel\"  />\n");
      out.write("                                                                </form>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <!--Credit Tab-->\n");
      out.write("                                                        <div class=\"tab-pane fade in\" id=\"credit-pills\">\n");
      out.write("                                                            <div class=\"card card-block\">\n");
      out.write("                                                                <form role=\"form\" method=\"GET\" name=\"credit-card\" action=\"success-payment.html\">\n");
      out.write("                                                                    <div class=\"form-group row\">\n");
      out.write("                                                                        <label class=\"col-sm-2 form-control-label text-xs-right\"> อีเมล : </label>\n");
      out.write("                                                                        <div class=\"col-sm-8\"> <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"อีเมล\" value=\"\"> </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"form-group row\">\n");
      out.write("                                                                        <label class=\"col-sm-2 form-control-label text-xs-right\"> ชื่อ - นามสกุล : </label>\n");
      out.write("                                                                        <div class=\"col-sm-4\"> <input type=\"text\" class=\"form-control\" name=\"firstname\" placeholder=\"ชื่อ\" value=\"\"> </div>\n");
      out.write("                                                                        <div class=\"col-sm-4\"> <input type=\"text\" class=\"form-control\" name=\"lastname\" placeholder=\"นามสกุล\" value=\"\"> </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"form-group row\">\n");
      out.write("                                                                        <label class=\"col-sm-2 form-control-label text-xs-right\"> ที่อยู่ : </label>\n");
      out.write("                                                                        <div class=\"col-sm-8\"> <input type=\"text\" class=\"form-control\" name=\"address\" placeholder=\"ที่อยู่\" value=\"\"> </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"form-group row\">\n");
      out.write("                                                                        <label class=\"col-sm-2 form-control-label text-xs-right\"> ตำบล : </label>\n");
      out.write("                                                                        <div class=\"col-sm-8\"> <input type=\"text\" class=\"form-control\" name=\"sub-district\" placeholder=\"ตำบล\" value=\"\"> </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"form-group row\">\n");
      out.write("                                                                        <label class=\"col-sm-2 form-control-label text-xs-right\"> อำเภอ : </label>\n");
      out.write("                                                                        <div class=\"col-sm-8\"> <input type=\"text\" class=\"form-control\" name=\"district\" placeholder=\"อำเภอ\" value=\"\"> </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"form-group row\">\n");
      out.write("                                                                        <label class=\"col-sm-2 form-control-label text-xs-right\"> จังหวัด : </label>\n");
      out.write("                                                                        <div class=\"col-sm-4\"> <input type=\"text\" class=\"form-control\" name=\"province\" placeholder=\"จังหวัด\" value=\"\"> </div>\n");
      out.write("                                                                        <div class=\"col-sm-4\"> <input type=\"text\" class=\"form-control\" name=\"postal-code\" placeholder=\"รหัสไปรษณีย์\" value=\"\"> </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"form-group row\">\n");
      out.write("                                                                        <label class=\"col-sm-2 form-control-label text-xs-right\"> หมายเลขบัตร : </label>\n");
      out.write("                                                                        <div class=\"col-sm-8\"> <input type=\"text\" class=\"form-control\" name=\"credit-card-number\" placeholder=\"หมายเลขบัตร\" value=\"\"> </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"form-group row\">\n");
      out.write("                                                                        <label class=\"col-sm-2 form-control-label text-xs-right\"> วันหมดอายุ : </label>\n");
      out.write("                                                                        <div class=\"col-sm-4\"> <input type=\"month\" class=\"form-control\" name=\"expired-card\" placeholder=\"ดด / ปป\" value=\"\"> </div>\n");
      out.write("                                                                        <label class=\"col-sm-1 form-control-label text-xs-right\"> CVV : </label>\n");
      out.write("                                                                        <div class=\"col-sm-3\"> <input type=\"password\" class=\"form-control\" name=\"cvv\" placeholder=\"cvv\" maxlength=\"5\" value=\"\"> </div>\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("                                                                    <!--Button-->\n");
      out.write("                                                                    <button type=\"submit\" class=\"btn btn-primary btn-block\"  value=\"Submit\"> <i class=\"fa fa-lock\"> </i> ยืนยันการชำระเงิน </button>\n");
      out.write("                                                                    <input type=\"submit\" class=\"btn btn-secondary btn-block\"  value=\"Cancel\"  />\n");
      out.write("                                                                </form>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /.card-block -->\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.card -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("                </article>\n");
      out.write("\n");
      out.write("                <!-- Footer -->\n");
      out.write("                <footer class=\"footer\">\n");
      out.write("                    <div class=\"container content\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <p> <h3>เกี่ยวกับเรา</h3> </p>\n");
      out.write("                            <h6><a href=\"about-us.jsp\">เรื่องราวของปันปัน</a></h6>\n");
      out.write("                            <h6><a href=\"team.jsp\">ทีมปันปัน</a></h6>\n");
      out.write("                            <h6><a href=\"how-it-works.jsp\">ขั้นตอนการบริจาค</a></h6>\n");
      out.write("                            <h6><a href=\"fee.jsp\">ค่าใช้จ่ายในการระดมทุน</a></h6>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <p> <h3>โครงการทั้งหมด</h3> </p>\n");
      out.write("                            ");
      if (_jspx_meth_sql_query_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <h6><a href=\"browse.jsp?category=0&sort=0\">ทั้งหมด</a></h6>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <p> <h3>การติดต่อ</h3> </p>\n");
      out.write("                            <h6><a href=\"mailto:punpunproject@gmail.com?Subject=หัวข้อ%20เรื่องที่ติดต่อ\" target=\"_top\"> <i class=\"fa fa-envelope\" style=\"color: #28ab60;\"> </i> <span> อีเมล </span> </a> </h6>\n");
      out.write("                            <h6><a href=\"https://www.facebook.com/punpunproject/\"> <i class=\"fa fa-facebook-square\" style=\"color: #4267b2;\"> </i> <span> Facebook </span> </a></h6>\n");
      out.write("                            <h6><a href=\"https://twitter.com\"> <i class=\"fa fa-twitter\" style=\"color: #1da1f2;\"> </i> <span> Twitter </span> </a></h6>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-12 want-top\" style=\"border-top: 1px solid #64798d;margin-top: 20px;\">\n");
      out.write("                            <div class=\"footer-block author\" style=\"margin-top: 20px;\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li> Theme by <a href=\"https://github.com/modularcode\"> ModularCode </a> </li>\n");
      out.write("                                    <li> Created by <a href=\"#\"> Disanuwat & Kanokwan </a> </li>\n");
      out.write("                                    <li> <a href=\"http://www.it.kmitl.ac.th\"> IT KMITL </a> </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Script -->\n");
      out.write("        <script src=\"assets/js/vendor.js\"></script>\n");
      out.write("        <script src=\"assets/js/app.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function myFunction() {\n");
      out.write("                var x = document.getElementById(\"myFile\");\n");
      out.write("                x.disabled = true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty member_id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <!-- login -->\n");
        out.write("                                <li class=\"header-block header-block-buttons\">\n");
        out.write("                                    <a href=\"login.jsp\" class=\"btn btn-none-shadow header-btn\"> <i class=\"fa fa-sign-in\"></i> <span> ลงชื่อเข้าใช้ </span> </a>\n");
        out.write("                                </li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${member_id != null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_sql_query_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_sql_query_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                <!-- notification -->\n");
        out.write("                                <li class=\"notifications new\">\n");
        out.write("                                    ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    <div class=\"dropdown-menu notifications-dropdown-menu\">\n");
        out.write("                                        <ul class=\"notifications-container\">\n");
        out.write("                                            ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        </ul>\n");
        out.write("                                        <footer>\n");
        out.write("                                            <ul>\n");
        out.write("                                                <li> <a href=\"\">\n");
        out.write("                                                        View All\n");
        out.write("                                                    </a> </li>\n");
        out.write("                                            </ul>\n");
        out.write("                                        </footer>\n");
        out.write("                                    </div>\n");
        out.write("                                </li>\n");
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_sql_query_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_sql_query_0.setVar("data");
    _jspx_th_sql_query_0.setDataSource(new String("punpun"));
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                                    SELECT * FROM notifications where member_id = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${member_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" and checked = 'F'\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_sql_query_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_1 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_sql_query_1.setVar("count");
    _jspx_th_sql_query_1.setDataSource(new String("punpun"));
    int[] _jspx_push_body_count_sql_query_1 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_1 = _jspx_th_sql_query_1.doStartTag();
      if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_1[0]++;
          _jspx_th_sql_query_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                                    SELECT count(notification_id) as count FROM notifications where member_id = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${member_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" and checked = 'F'\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_sql_query_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_1[0]--;
      }
      if (_jspx_th_sql_query_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_1.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_forEach_0.setVar("num");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <a href=\"\" data-toggle=\"dropdown\"> <i class=\"fa fa-bell-o\"></i> <sup>\n");
          out.write("                                                <span class=\"counter\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${num.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                            </sup>\n");
          out.write("                                        </a>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_forEach_1.setVar("noti");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                <li>\n");
          out.write("                                                    <a href=\"\" class=\"notification-item\">\n");
          out.write("                                                        <div class=\"img-col\">\n");
          out.write("                                                            <div class=\"img\" style=\"background-image: url('assets/img/logo.png')\"></div>\n");
          out.write("                                                        </div>\n");
          out.write("                                                        <div class=\"body-col\">\n");
          out.write("                                                            <p> <span class=\"accent\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${noti.actor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${noti.action}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(": <span class=\"accent\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${noti.detail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>. </p>\n");
          out.write("                                                        </div>\n");
          out.write("                                                    </a>\n");
          out.write("                                                </li>\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_sql_query_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_2 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_sql_query_2.setVar("data");
    _jspx_th_sql_query_2.setDataSource(new String("punpun"));
    int[] _jspx_push_body_count_sql_query_2 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_2 = _jspx_th_sql_query_2.doStartTag();
      if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_2[0]++;
          _jspx_th_sql_query_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_2.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                                    SELECT * FROM members where member_id = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${member_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_sql_query_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_2[0]--;
      }
      if (_jspx_th_sql_query_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_2.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_forEach_2.setVar("user");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <!-- profile -->\n");
          out.write("                                    <li class=\"profile dropdown\">\n");
          out.write("                                        <a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
          out.write("                                            <div class=\"img\" style=\"background-image: url('assets/img/profile/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${member_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".jpg')\"> </div> <span class=\"name\">\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.first_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                            </span> </a>\n");
          out.write("                                        <div class=\"dropdown-menu profile-dropdown-menu\" aria-labelledby=\"dropdownMenu1\">\n");
          out.write("                                            <a class=\"dropdown-item\" href=\"profile.jsp/?member_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${member_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> <i class=\"fa fa-user icon\"></i> โพรไฟล์ </a>\n");
          out.write("                                            <a class=\"dropdown-item\" href=\"dashboard.jsp\"> <i class=\"fa fa-user icon\"></i> แดชบอร์ด </a>\n");
          out.write("                                            <a class=\"dropdown-item\" href=\"dashboard-project-list.jsp\"> <i class=\"fa fa-bell icon\"></i> โครงการของคุณ </a>\n");
          out.write("                                            <a class=\"dropdown-item\" href=\"dashboard-account-setting.jsp\"> <i class=\"fa fa-gear icon\"></i> ตั้งค่าบัญชีผู้ใช้ </a>\n");
          out.write("                                            <div class=\"dropdown-divider\"></div>\n");
          out.write("                                            <a class=\"dropdown-item\" href=\"logoutServlet\"> <i class=\"fa fa-power-off icon\"></i> ลงชื่อออก </a>\n");
          out.write("                                        </div>\n");
          out.write("                                    </li>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_sql_query_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_3 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_3.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_3.setParent(null);
    _jspx_th_sql_query_3.setVar("category");
    _jspx_th_sql_query_3.setDataSource(new String("punpun"));
    int[] _jspx_push_body_count_sql_query_3 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_3 = _jspx_th_sql_query_3.doStartTag();
      if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_3[0]++;
          _jspx_th_sql_query_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_3.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                                SELECT * FROM project_categories\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_sql_query_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_3[0]--;
      }
      if (_jspx_th_sql_query_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_3.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("data3");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <h6><a href=\"browse.jsp?category=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data3.project_category_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&sort=0\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data3.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h6>\n");
          out.write("\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
