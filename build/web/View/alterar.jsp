
<%@page import="Persistente.ProdutoDB"%>
<%@page import="Dominio.Produto"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="refresh" content="600">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <title>Document</title>
    </head>

    <body >
        <%
                        if(Conexao.ConexaoDAO.ConexaoBD() != null){
            //Verificar se voltou do controller para atualizar os iframes
            String voltou = request.getParameter("voltou");
            if (voltou != null) {

                if (request.getParameter("voltou").equals("true")) {

        %>
        <script type="text/javascript">
            window.parent.refresh();
            window.location.href = "alterar.jsp";
        </script>
        <%                }
            }
        %>
        <div style="width: 1000px;border: none;position: relative" class="login">
            <h1 style="color: #807C7C"><i style="color:white;text-shadow: 0px 0px 5px gray;" class="fa fa-pencil"></i>Alterar
                produto</h1>
                <%
                    //Puxar produtos no banco de dados
                    ArrayList<Produto> lista = ProdutoDB.listar();
                    for (int c = 0; c < lista.size(); c++) {
                        Produto cadaProduto = lista.get(c);
                %>
            <div class="produto-remove">
                <div class="infos-remove">
                    <img src="<%= cadaProduto.getLink() %>" alt="">
                    <h1><%= cadaProduto.getNome()%></h1>
                </div>
                <form style="width: 80px" method="POST" action="AlterarTwo.jsp" target="alterarInputs"> <input name="id" type="hidden" value="<%=cadaProduto.getIdProduto()%>"> <button style="width: 80px;background: none;border: none" type="submit"><i onclick="alterarTrue()" style="color: green;cursor: pointer" class="fa fa-pencil fa-lg"></i></button></form>
            </div>

            <%
                }
} else {
out.print("Banco de dados não identificado!");
}
            %>
            <div id="alterarAttach" style="position: absolute;left: 20%;top: 10%;border: solid 2px gray;background-color: white;padding: 50px;border-radius: 20px;display: none">
                <iframe name="alterarInputs" style="width: 500px;height: 500px" src="AlterarTwo.jsp" frameborder="0">

                </iframe>
            </div>
        </div>
        <script type="text/javascript">
            //Exibir o iframe de alteção de produto
            alterarAttach = document.getElementById('alterarAttach');
            function alterarTrue() {
                alterarAttach.style.display = 'block';
            }
            function alterarFalse() {
                alterarAttach.style.display = 'none';
            }

        </script>
    </body>

</html>
