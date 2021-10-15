

<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dominio.Produto"%>
<%@page import="Persistente.ProdutoDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="View/style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="slick-1.8.1/slick/slick.css" />
        <link rel="stylesheet" type="text/css" href="slick-1.8.1/slick/slick-theme.css" />
        <title>Ecommerce</title>
    </head>

    <body>

        <jsp:include page="View/menu.jsp" />
        <%
            //Formata os valores dos produtos
            DecimalFormat formatter = new DecimalFormat("#,###.##");
            String search = null;
            //Verifica a existencia do parametro search
            if (request.getParameter("search") != null) {
                search = request.getParameter("search");
            }
        %>
        <!-- Remover tudo acima depois -->

        <!-- Destaque -->
        <div class="destaque">
            <div class="content-destaque">
                <div class="infos-destaque">
                    <div class="text">
                        <h1>HEADSET HYPERX</h1>
                        <p>A partir de R$500,00</p>
                    </div>
                    <div class="img">
                        <img src="img/headset-hyperx-cloud-ii-kingston-red-khx-hscp-rd_24084.png" alt="">
                    </div>
                </div>
            </div>
            <div class="content-destaque">
                <div class="infos-destaque">
                    <div class="text">
                        <h1>XBOX ONE</h1>
                        <p>A partir de R$900,00</p>
                    </div>
                    <div class="img">
                        <img src="img/i413220.png" alt="">
                    </div>
                </div>
            </div>
        </div>
        <!-- Fim destaque -->

        <div class="produtos">
            <%
                                        if(Conexao.ConexaoDAO.ConexaoBD() != null){
                ArrayList<Produto> list = null;
                //Se existir o parametro search, ele faz uma busca do parametro no banco, caso não, puxa tudo
                if (search == null || search.equals("")) {
                    list = ProdutoDB.listar();
                } else {
                    list = ProdutoDB.FindByName(search);
                    }
                    if (list.size() == 0) { 
                        out.print("Produto não encontrado");
                }
                for (int c = 0; c < list.size(); c++) {
                    Produto cadaProduto = list.get(c);

            %>
            <div onclick="window.location.href = 'View/comprar.jsp?id=<%= cadaProduto.getIdProduto()%>'" class="produtos-box">
                <div class="produtos-img">
                    <img src="<%= cadaProduto.getLink()%>" alt="">
                </div>
                <div class="nome">
                    <h1><%=  cadaProduto.getNome()%></h1>
                </div>
                <div class="valores">
                    <h1 style="color: blue;font-family: Arial">R$<%=  formatter.format(cadaProduto.getValor())%></h1>
                    <h3><%=  cadaProduto.getMaxParcelas()%>X DE R$<%=  formatter.format((cadaProduto.getValor() / cadaProduto.getMaxParcelas()))%> SEM JUROS</h3>
                </div>

            </div>
            <%
                }
} else {
out.print("Banco de dados não identificado!");
}
            %>


        </div>
























        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script type="text/javascript" src="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>
        <script type="text/javascript">
                $('.destaque').slick({
                    dots: true,
                    arrows: false,
                    infinite: true,
                    autoplay: true,
                    autoplayspeed: 2000

                });
        </script>
    </body>

</html>
