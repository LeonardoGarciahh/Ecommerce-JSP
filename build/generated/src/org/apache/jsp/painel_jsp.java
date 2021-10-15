package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class painel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html class=\"menu\">\n");
      out.write("    <html>\n");
      out.write("\n");
      out.write("        <head>\n");
      out.write("\n");
      out.write("            <meta charset=\"utf-8\" />\n");
      out.write("            <meta http-equiv=\"X-UA-Compatible\" content==\"IE=edge\" />\n");
      out.write("            <meta name=\"google\" value=\"notranslate\" />\n");
      out.write("            <title>Painel</title>\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"left-menu.css\">\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <nav style=\"\" class=\"main-menu\">\n");
      out.write("                <div>\n");
      out.write("                    <a class=\"logo\" href=\"#\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"settings\"></div>\n");
      out.write("                <div class=\"scrollbar\" id=\"style-1\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"index.jsp\">\n");
      out.write("                                <i class=\"fa fa-home fa-lg\"></i>\n");
      out.write("                                <span  id=\"alterar\" class=\"nav-text\">Voltar ao inicio</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li onclick=\"mostrarAdicionar()\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <i class=\"fa fa-plus fa-lg\"></i>\n");
      out.write("                                <span id=\"add\" class=\"nav-text\">Adicionar produto</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li onclick=\"mostrarRemover()\" >\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <i class=\"fa fa-trash fa-lg\"></i>\n");
      out.write("                                <span id=\"remove\" class=\"nav-text\">Remover produto</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li onclick=\"mostrarAlterar()\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <i class=\"fa fa-pencil fa-lg\"></i>\n");
      out.write("                                <span  id=\"alterar\" class=\"nav-text\">Alterar produto</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("            </nav>\n");
      out.write("            <iframe id=\"adicionarFrame\" style=\"width: 80%; height: 900px;margin: 0 auto;display: block;\" src=\"adicionar.jsp\" frameborder=\"0\"></iframe>\n");
      out.write("            <iframe id=\"removerFrame\" style=\"width: 80%; height: 900px;margin: 0 auto;display: none;\" src=\"remover.jsp\" frameborder=\"0\"></iframe>\n");
      out.write("            <iframe id=\"alterarFrame\" style=\"width: 80%; height: 900px;margin: 0 auto;display: none;\" src=\"alterar.jsp\" frameborder=\"0\"></iframe>\n");
      out.write("            \n");
      out.write("            <script type=\"text/javascript\" src=\"painel.js\"></script>\n");
      out.write("        </body>\n");
      out.write("\n");
      out.write("    </html>\n");
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
