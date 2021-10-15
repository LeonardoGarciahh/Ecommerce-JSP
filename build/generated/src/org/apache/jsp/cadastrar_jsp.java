package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <title>Document</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"login\">\n");
      out.write("        <h1 style=\"color: #807C7C\"><i style=\"color:white;text-shadow: 0px 0px 5px gray;\" class=\"fa fa-user\"></i>Cadastro\n");
      out.write("            do\n");
      out.write("            cliente</h1>\n");
      out.write("        <form action=\"Controller/salvar.jsp\" method=\"POST\">\n");
      out.write("            <div class=\"inputs\">\n");
      out.write("                <label for=\"\">Nome completo</label>\n");
      out.write("                <input type=\"text\" name=\"nome\">\n");
      out.write("            </div>\n");
      out.write("            <label style=\"margin-left: 73px;font-size: 20px;margin-bottom: 5px;\" for=\"\">Genêro</label>\n");
      out.write("            <div class=\"radios\">\n");
      out.write("                <div class=\"radio\">\n");
      out.write("                    <input type=\"radio\" name=\"sexo\" value=\"Masculino\">\n");
      out.write("                    <label for=\"\">Masculino</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"radio\">\n");
      out.write("                    <input type=\"radio\" name=\"sexo\" value=\"Feminino\">\n");
      out.write("                    <label for=\"\">Feminino</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"radio\">\n");
      out.write("                    <input type=\"radio\" name=\"sexo\" value=\"Não informar\">\n");
      out.write("                    <label for=\"\">Não informar</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"margin-left: 70px;\" class=\"inputs\">\n");
      out.write("                <label for=\"\">Data de nascimento</label>\n");
      out.write("                <input name=\"date\" type=\"date\" style=\"max-width: 160px;\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"inputs\">\n");
      out.write("                <label for=\"\">CPF</label>\n");
      out.write("                <input name=\"cpf\" type=\"text\" placeholder=\"___ ___ ___ - __\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"inputs\">\n");
      out.write("                <label for=\"\">Telefone</label>\n");
      out.write("                <input name=\"telefone\" type=\"number\" placeholder=\"(__) _____-____\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"inputs\">\n");
      out.write("                <label for=\"\">Email</label>\n");
      out.write("                <input name=\"email\" type=\"text\" placeholder=\"Ex: Joaozinho@hotmail.com\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"inputs\">\n");
      out.write("                <label for=\"\">Senha</label>\n");
      out.write("                <label style=\"color: rgba(128, 128, 128, 0.767);\" for=\"\">Acima de de 8 caracteres</label>\n");
      out.write("                <input name=\"senha\" type=\"text\" placeholder=\"Ex: Joaozinho@hotmail.com\">\n");
      out.write("            </div>\n");
      out.write("            <input style=\"max-width: 180px;\" type=\"submit\" value=\"Cadastrar\">\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <h1 style=\"color: #707070;text-align: center;font-size: 23px;margin-bottom: 30px;\">Já tem cadastro? <a href=\"login.html\" style=\"color: #707070;\">entrar</a></h1>\n");
      out.write("</body>\n");
      out.write("\n");
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
}
