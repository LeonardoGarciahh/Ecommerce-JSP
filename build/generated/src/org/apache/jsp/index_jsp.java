package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import Dominio.Produto;
import Persistente.ProdutoDB;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"slick-1.8.1/slick/slick.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"slick-1.8.1/slick/slick-theme.css\" />\n");
      out.write("    <title>Ecommerce</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/menu.jsp", out, false);
      out.write("\n");
      out.write("    ");

        DecimalFormat formatter = new DecimalFormat("#,###.##");
        String search = null;
       if(request.getParameter("search") != null){
           search = request.getParameter("search");
       }
    
      out.write("\n");
      out.write("    <!-- Remover tudo acima depois -->\n");
      out.write("\n");
      out.write("    <!-- Destaque -->\n");
      out.write("    <div class=\"destaque\">\n");
      out.write("        <div class=\"content-destaque\">\n");
      out.write("            <div class=\"infos-destaque\">\n");
      out.write("                <div class=\"text\">\n");
      out.write("                    <h1>HEADSET HYPERX</h1>\n");
      out.write("                    <p>Apartir de R$500,00</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"img\">\n");
      out.write("                    <img src=\"img/headset-hyperx-cloud-ii-kingston-red-khx-hscp-rd_24084.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content-destaque\">\n");
      out.write("            <div class=\"infos-destaque\">\n");
      out.write("                <div class=\"text\">\n");
      out.write("                    <h1>XBOX ONE</h1>\n");
      out.write("                    <p>Apartir de R$900,00</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"img\">\n");
      out.write("                    <img src=\"img/i413220.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Fim destaque -->\n");
      out.write("\n");
      out.write("    <div class=\"produtos\">\n");
      out.write("                ");

            ArrayList<Produto> list = null;
            if(search==null || search.equals("")){
            list = ProdutoDB.listar();
            } else {
                list = ProdutoDB.FindByName(search);
            }
            for(int c = 0;c<list.size();c++){
            Produto cadaProduto = list.get(c);
        
      out.write("\n");
      out.write("        <div onclick=\"window.location.href = 'comprar.jsp?id=");
      out.print( cadaProduto.getIdProduto() );
      out.write("'\" class=\"produtos-box\">\n");
      out.write("            <div class=\"produtos-img\">\n");
      out.write("                <img src=\"");
      out.print( cadaProduto.getLink() );
      out.write("\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nome\">\n");
      out.write("                <h1>");
      out.print(  cadaProduto.getNome() );
      out.write("</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"valores\">\n");
      out.write("                <h1 style=\"color: blue;font-family: Arial\">R$");
      out.print(  formatter.format(cadaProduto.getValor()) );
      out.write("</h1>\n");
      out.write("                <h3>");
      out.print(  cadaProduto.getMaxParcelas());
      out.write("X DE R$");
      out.print(  formatter.format((cadaProduto.getValor()/cadaProduto.getMaxParcelas())));
      out.write(" SEM JUROS</h3>\n");
      out.write("            </div>\n");
      out.write("               \n");
      out.write("        </div>\n");
      out.write("             ");

        }
        
      out.write("\n");
      out.write("        \n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $('.destaque').slick({\n");
      out.write("        dots: true,\n");
      out.write("        arrows: false,\n");
      out.write("        infinite: true,\n");
      out.write("        autoplay: true,\n");
      out.write("        autoplayspeed: 2000\n");
      out.write("\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
