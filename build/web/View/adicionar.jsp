
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
            //Verificar se voltou do controller para atualizar os iframes

            String voltou = request.getParameter("voltou");
            if (voltou != null) {

                if (request.getParameter("voltou").equals("true")) {

        %>
        <script type="text/javascript">
            //Refresh no iframe
            window.parent.refresh();
            window.location.href = "adicionar.jsp";
        </script>
        <%                }
            }
        %>
        <div class="login">
            <h1 style="color: #807C7C"><i style="color:white;text-shadow: 0px 0px 5px gray;"
                                          class="fa fa-user"></i>Adicionar produto</h1>
            <form action="../Controller/adicionarProduto.jsp" method="POST">
                <div class="inputs">
                    <label for="">Link foto do produto</label>
                    <input name="link" type="text" placeholder="">
                    <label for="">Nome</label>
                    <input name="nome" type="text" placeholder="Ex: Pão de queijo">
                    <label for="">Valor</label>
                    <input name="valor" style="max-width: 150px;" type="number" placeholder="R$0,00">
                    <label for="">Maximo de parcelas</label>
                    <input name="parcelas" style="max-width: 150px;" type="number" placeholder="Ex: 1">
                    <label for="">Descrição</label>
                    <input name="descricao" type="text">
                    <input style="max-width: unset;" type="submit" value="Cadastrar produto">
                </div>
            </form>
        </div>
    </body>

</html>
