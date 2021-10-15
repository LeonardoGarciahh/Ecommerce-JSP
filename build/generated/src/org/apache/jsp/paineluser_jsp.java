package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dominio.Produto;
import Persistente.ProdutoDB;
import java.util.ArrayList;
import Dominio.Venda;
import Persistente.VendaDB;

public final class paineluser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <title>Document</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/menu.jsp", out, false);
      out.write("\n");
      out.write("        <div style=\"border: none;\" class=\"login\">\n");
      out.write("            <h1 style=\"color: #807C7C\"><i style=\"color:white;text-shadow: 0px 0px 5px gray;\"\n");
      out.write("                                          class=\"fa fa-user\"></i>Lista de pedidos</h1>\n");
      out.write("            <table class=\"infos-user\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Nome</th>\n");
      out.write("                    <th>Data de compra</th>\n");
      out.write("                    <th>Valor</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    ArrayList<Venda> vendas = VendaDB.listar();
                    String idUsuario = session.getAttribute("idUser").toString();
                    for (int c = 0; c < vendas.size(); c++) {
                        Venda cadaVenda = vendas.get(c);
                        out.print(cadaVenda.getDtVenda());
                        if (cadaVenda.getIdUsuario() == Integer.parseInt(idUsuario) && cadaVenda.getCancelada() != true) {
                            Produto cadaProduto = ProdutoDB.FindById(cadaVenda.getIdProduto());


                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><img src=\"img/headset-hyperx-cloud-ii-kingston-red-khx-hscp-rd_24084.png\" alt=\"\">");
      out.print( cadaProduto.getNome() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cadaVenda.getDtVenda() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cadaVenda.getValor() );
      out.write("</td>\n");
      out.write("                    <td><form action=\"\"><input type=\"hidden\" name=\"id\" value=\"id\"><input type=\"submit\" value=\"Cancelar\"></form></td>\n");
      out.write("                </tr>\n");
      out.write("                ");
                    }

                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
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
