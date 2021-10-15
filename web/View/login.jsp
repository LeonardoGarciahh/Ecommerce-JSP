
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (session.getAttribute("logado") != null) {
        response.sendRedirect("painel.jsp");
    }
%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <title>Entrar</title>
    </head>

    <body>
        <jsp:include page="/View/menu.jsp" />
        <div class="login">
            <h1 style="color: #807C7C"><i style="color:white;text-shadow: 0px 0px 5px gray;" class="fa fa-user"></i>Login do
                cliente</h1>
            <form action="../Controller/entrar.jsp" method="POST">
                <div class="inputs">
                    <label for="">e-mail:</label>
                    <input name="login" type="email" placeholder="Ex: Joaozinho@hotmail.com" required>
                </div>
                <div class="inputs">
                    <label for="">Senha:</label>
                    <input name="senha" type="password" required>
                </div>
                <input type="submit" value="Entrar">

            </form>
        </div>
        <h1 style="color: #707070;text-align: center;font-size: 23px;">Não tem cadastro? <a href="cadastrar.jsp" style="color: #707070;">cadastrar-se</a></h1>
    </body>

</html>
