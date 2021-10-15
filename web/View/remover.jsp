
<%@page import="java.sql.Connection"%>
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
        <meta http-equiv="refresh" content="600">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <title>Document</title>
    </head>

    <body>
        <%
            if(Conexao.ConexaoDAO.ConexaoBD() != null){
            String voltou = request.getParameter("voltou");
            if (voltou != null) {

                if (request.getParameter("voltou").equals("true")) {

        %>
        <script type="text/javascript">
            window.parent.refresh();
            window.location.href = "remover.jsp";
        </script>
        <%                }
            }
        %>

        <div style="width: 1000px;border: none;" class="login">
            <h1 style="color: #807C7C"><i style="color:white;text-shadow: 0px 0px 5px gray;" class="fa fa-trash"></i>Remover
                produto</h1>
                <%
                    ArrayList<Produto> lista = ProdutoDB.listar();
                    for (int c = 0; c < lista.size(); c++) {
                        Produto cadaProduto = lista.get(c);
                %>
            <div class="produto-remove">
                <div class="infos-remove">
                    <img src="<%= cadaProduto.getLink() %>" alt="">
                    <h1><%= cadaProduto.getNome()%></h1>
                </div>
                <form style="width: 80px" method="POST" action="../Controller/remover.jsp" >
                    <input name="id" type="hidden" value="<%=cadaProduto.getIdProduto()%>">
                    <button onclick="return confirm('Deseja mesmo excluir?')" style="width: 80px;background: none;border: none" type="submit">
                        <i style="color: red;cursor: pointer" class="fa fa-trash fa-lg"></i>
                    </button>
                </form>
            </div>
            <%
                }
} else {
out.print("Banco de dados não identificado!");
}
            %>
        </div>
    </body>

</html>
