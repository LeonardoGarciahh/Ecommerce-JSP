
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="PT-BR">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


        <link rel="stylesheet" href="style.css">
        <title>Cadastro</title>
    </head>

    <body>
        <jsp:include page="/View/menu.jsp" />
        <div class="login">
            <h1 style="color: #807C7C"><i style="color:white;text-shadow: 0px 0px 5px gray;" class="fa fa-user"></i>Cadastro
                do
                cliente</h1>
            <form action="../Controller/salvar.jsp" method="POST">
                <div class="inputs">
                    <label for="">Nome completo</label>
                    <input type="text" name="nome" required maxlength="100">
                </div>
                <label style="margin-left: 73px;font-size: 20px;margin-bottom: 5px;" for="">Genêro</label>
                <div class="radios">
                    <div class="radio">
                        <input type="radio" name="sexo" value="0">
                        <label for="">Masculino</label>
                    </div>
                    <div class="radio">
                        <input type="radio" name="sexo" value="1">
                        <label for="">Feminino</label>
                    </div>
                    <div class="radio">
                        <input type="radio" name="sexo" value="2">
                        <label for="">Não informar</label>
                    </div>
                </div>
                <div style="margin-left: 70px;" class="inputs">
                    <label for="">Data de nascimento</label>
                    <input name="date" type="date" style="max-width: 160px;">
                </div>
                <div class="inputs">
                    <label for="">CPF</label>
                    <input name="cpf" id="cpf" type="text" placeholder="___ ___ ___ - __" required maxlength="11">
                </div>
                <div class="inputs">
                    <label for="">Telefone</label>
                    <input id="telefone" name="telefone" type="text" placeholder="(__) _____-____" maxlength="11">
                </div>
                <div class="inputs">
                    <label for="">Email</label>
                    <input name="email" type="email" placeholder="Ex: Joaozinho@hotmail.com" required maxlength="100">
                </div>
                <div class="inputs">
                    <label for="">Senha</label>
                    <label style="color: rgba(128, 128, 128, 0.767);" for="">Acima de de 8 caracteres</label>
                    <input name="senha" type="password" placeholder="" minlength="8" required maxlength="60">
                </div>
                <input style="max-width: 180px;" type="submit" value="Cadastrar">

            </form>
        </div>
        <h1 style="color: #707070;text-align: center;font-size: 23px;margin-bottom: 30px;">Já tem cadastro? <a href="login.jsp" style="color: #707070;">entrar</a></h1>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.11/jquery.mask.min.js"></script>
            <script type="text/javascript">
    //Adiciona mascara a input de telefone e cpf
    $("#telefone").mask("(00) 00000-0000");
    $("#cpf").mask("000.000.000-00");
    </script>
    </body>

</html>