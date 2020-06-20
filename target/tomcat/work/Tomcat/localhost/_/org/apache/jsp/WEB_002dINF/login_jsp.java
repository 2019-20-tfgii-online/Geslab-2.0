/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-06-19 17:24:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/bootstrap/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/style.css\">\r\n");
      out.write("\r\n");
      out.write("<title>Geslab 2.0</title>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"../images/favicon.png\"/>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");

	String mensaje = (String) request.getAttribute("mensaje");
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container-fluid-login\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<svg class=\"animacion\" viewBox=\"0 0 992 558\">\r\n");
      out.write(" \t\t\t<path class=\"animacion__pink-wave\" d=\"M122.81-1.29c151.59,227.38,273.31,271.97,356.52,270.58c182.96-3.06,264.46-229.83,578.32-334.45\r\n");
      out.write("  \t\t\t\tc105.05-35.02,197.3-43.4,256.65-45.29\"/>\r\n");
      out.write(" \t\t\t<path class=\"animacion__purple-wave\" d=\"M84.48-23.35c7.46,40.15,74.57,374.82,336.77,480.77c38.27,15.46,140.95,56.96,252,20.9\r\n");
      out.write("  \t\t\t\tc96.05-31.18,150.17-104.73,205.55-180c112.22-152.52,88.9-225.33,173.03-303.1c48.08-44.45,134.61-93.61,300.77-89.42\"/>\r\n");
      out.write("\t\t</svg>\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"../js/anime.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../js/animation.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-12 py-5\">\r\n");
      out.write("\t\t\t\t\t<img class=\"header__logo--login\" src=\"../images/logo-geslab-login.svg\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row align-items-center py-4\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"col-12 col-md-5 ubu\">\r\n");
      out.write("\t\t\t\t\t<img class=\"login-info__logo\" src=\"../images/logo-ubu.svg\">\r\n");
      out.write("\t\t\t\t\t<p class=\"col-sm-12 col-lg-8 login-info__texto mt-3 pl-0\">Aplicación\r\n");
      out.write("\t\t\t\t\t\tde gestión del inventario de los laboratorios de química\r\n");
      out.write("\t\t\t\t\t\tdesarrollada para la Universidad de Burgos</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-12 col-md-7\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-12 col-lg-8 login-form py-3 px-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"/login.do\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"usuario-ip\" class=\"col-4 login-form__label\">Usuario</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"col-12 login-form__input\" name=\"usuario\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"usuario-ip\" placeholder=\"bioqbm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row align-items-center mt-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"password-ip\" class=\"col-6 login-form__label\">Contraseña</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"col-12 login-form__input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"password\" id=\"password-ip\" placeholder=\"********\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row align-items-center mt-5 px-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-8 px-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
if(mensaje != null){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"mensaje\" class=\"mensaje-alerta form-inline mr-4 justify-content-between\">\r\n");
      out.write("\t                                         <p class=\"d-inline-flex pr-4\">");
      out.print(mensaje);
      out.write("<p>\r\n");
      out.write("\t                                         <button id=\"cerrar-mensaje\" type=\"button\" class=\"close flex-fill\" aria-label=\"Close\" style=\"color: #ff0837;\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                                     \t</div>\r\n");
      out.write("                                     \t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-4 px-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn float-right login-form__button py-0 px-3\">Entrar</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\r\n");
      out.write("\t<script src=\"../js/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t$( document ).ready(function() {\r\n");
      out.write("\t\t$(document).on(\"click\", \"#cerrar-mensaje\", function() {\r\n");
      out.write("\t\t\t$('#mensaje').css(\"display\", \"none\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
