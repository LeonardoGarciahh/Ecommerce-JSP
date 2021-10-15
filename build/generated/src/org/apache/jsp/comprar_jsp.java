package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Dominio.Produto;
import Persistente.ProdutoDB;

public final class comprar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <title>Document</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/menu.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("            ");


                String id = request.getParameter("id");
                if(id!=null && session.getAttribute("idUser") != null){
                Produto produto = ProdutoDB.FindById(Integer.parseInt(id));
                

                
      out.write("\n");
      out.write("            <h1 id=\"head\">");
      out.print( produto.getNome());
      out.write("</h1>\n");
      out.write("            <div class=\"img\">\n");
      out.write("                <img src=\"");
      out.print( produto.getLink());
      out.write("\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <form class=\"infos-pagamento\" method=\"POST\" action=\"Controller/comprar.jsp\">\n");
      out.write("                <div class=\"endereco\">\n");
      out.write("                    <h1>Endereço</h1>\n");
      out.write("                    <div class=\"input-comprar\">\n");
      out.write("                        <i class=\"fa fa-map-marker\"></i>\n");
      out.write("                        <input name=\"cep\" id=\"cep\" type=\"text\" placeholder=\"CEP\" onblur=\"pesquisacep(this.value)\" maxlength=\"8\" minlength=\"8\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <h2 style=\"margin-left: 15px;\"><span id=\"rua\"></span> <span id=\"bairro\"></span><span id=\"cidade\"></span>\n");
      out.write("                    </h2>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <h1>Pagamento</h1>\n");
      out.write("                <div style=\"display: flex;flex-wrap: wrap;\" class=\"endereco\">\n");
      out.write("                    <div class=\"payment\">\n");
      out.write("                        <h1></h1>\n");
      out.write("                        <label for=\"\">Parcelas</label>\n");
      out.write("                        <select id=\"parcelas\" name=\"parcelas\" id=\"\" onblur=\"calcular()\">\n");
      out.write("                            ");

                                for (int c = 1; c <= produto.getMaxParcelas(); c++) {
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(c);
      out.write('"');
      out.write('>');
      out.print(c);
      out.write("</option>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"payment\">\n");
      out.write("                        <label for=\"\">Quantidade</label>\n");
      out.write("                        <input id=\"quantidade\" style=\"width: 50px;padding: 5px\" type=\"number\" name=\"quantidade\" value=\"1\" onblur=\"calcular()\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <h3 style=\"color: #707070;margin-left: 15px\">Valor do produto: R$");
      out.print( produto.getValor());
      out.write(" </h3>\n");
      out.write("                <h1 style=\"font-family: impact\">Total: <span id=\"valor\">1x de R$1200,00</span></h1>\n");
      out.write("                <div class=\"input-comprar\">\n");
      out.write("                    <i class=\"fa fa-credit-card\"></i>\n");
      out.write("                    <input id=\"card\" type=\"text\" placeholder=\"Number card\" name=\"numbercard\" maxlength=\"16\" minlength=\"16\" required>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"max-width: 250px;display: flex;\" class=\"input-comprar\" >\n");
      out.write("                    <label for=\"\" style=\"color: #707070;margin-left: 15px;\">Data de vencimento</label>\n");
      out.write("                    <input type=\"date\" required>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"max-width: 130px;\" class=\"input-comprar\">\n");
      out.write("                    <i class=\"fa fa-credit-card\"></i>\n");
      out.write("                    <input type=\"text\" placeholder=\"CVC\" maxlength=\"4\" minlength=\"3\" required name=\"cvc\">\n");
      out.write("                </div>\n");
      out.write("                <input type=\"hidden\" value=\"valor\" name=\"valor\" id=\"valorTotal\">\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print( produto.getIdProduto());
      out.write("\" name=\"idProduto\">\n");
      out.write("                <input onclick=\"return confirm('Deseja realmente comprar?');\" type=\"submit\" value=\"Confirmar compra\">\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"cep.js\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.11/jquery.mask.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("                            $(\"#card\").mask(\"0000 0000 0000 0000\");\n");
      out.write("                            $(\"cep\").mask(\"00000-000\");\n");
      out.write("                            function calcular() {\n");
      out.write("                                parcela = document.getElementById('parcelas').value;\n");
      out.write("                                textValor = document.getElementById('valor');\n");
      out.write("                                quantidade = document.getElementById('quantidade').value;\n");
      out.write("                                valorTotal = document.getElementById('valorTotal');\n");
      out.write("                                let calc = ");
      out.print( produto.getValor());
      out.write(" / parseInt(parcela) * quantidade;\n");
      out.write("                                console.log(calc);\n");
      out.write("                                console.log(parcela);\n");
      out.write("                                textValor.innerHTML = parcela + \"x de R$\" + calc;\n");
      out.write("                                valorTotal.value = calc;\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        ");

            } else {
response.sendRedirect("index.jsp");
}
        
      out.write("\n");
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
