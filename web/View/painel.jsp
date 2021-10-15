

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //Verifica se está logado
if(session.getAttribute("logado") == null){
   response.sendRedirect("login.jsp");
}
%>
<!DOCTYPE html>
<html class="menu">
    <html>

        <head>

            <meta charset="utf-8" />
            <meta http-equiv="X-UA-Compatible" content=="IE=edge" />
            <meta name="google" value="notranslate" />
            <title>Painel</title>
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
            <link rel="stylesheet" href="style.css">
            <link rel="stylesheet" href="left-menu.css">
        </head>
        <body>


            <nav style="" class="main-menu">
                <div>
                    <a class="logo" href="#">
                    </a>
                </div>
                <div class="settings"></div>
                <div class="scrollbar" id="style-1">
                    <ul>
                        <li>
                            <a href="../index.jsp">
                                <i class="fa fa-home fa-lg"></i>
                                <span  id="alterar" class="nav-text">Voltar ao inicio</span>
                            </a>
                        </li>
                        <li onclick="mostrarAdicionar()">
                            <a href="#">
                                <i class="fa fa-plus fa-lg"></i>
                                <span id="add" class="nav-text">Adicionar produto</span>
                            </a>
                        </li>
                        <li onclick="mostrarRemover()" >
                            <a href="#">
                                <i class="fa fa-trash fa-lg"></i>
                                <span id="remove" class="nav-text">Remover produto</span>
                            </a>
                        </li>
                        <li onclick="mostrarAlterar()">
                            <a href="#">
                                <i class="fa fa-pencil fa-lg"></i>
                                <span  id="alterar" class="nav-text">Alterar produto</span>
                            </a>
                        </li>
                        <li onclick="mostrarListar()">
                            <a href="#">
                                <i class="fa fa-usd fa-lg"></i>
                                <span  id="alterar" class="nav-text">Lista de vendas</span>
                            </a>
                        </li>
                        <li>
                            <a href="../Controller/logout.jsp">
                                <i class="fa fa-sign-out fa-lg"></i>
                                <span   class="nav-text">Sair</span>
                            </a>
                        </li>
                    </ul>
            </nav>
            <iframe id="adicionarFrame" style="width: 80%; height: 900px;margin: 0 auto;display: block;" src="adicionar.jsp" frameborder="0"></iframe>
            <iframe id="removerFrame" style="width: 80%; height: 900px;margin: 0 auto;display: none;" src="remover.jsp" frameborder="0"></iframe>
            <iframe id="alterarFrame" style="width: 80%; height: 900px;margin: 0 auto;display: none;" src="alterar.jsp" frameborder="0"></iframe>
            <iframe id="listarFrame" style="width: 80%; height: 900px;margin: 0 auto;display: none;" src="vendas.jsp" frameborder="0"></iframe>
            
            <script type="text/javascript" src="painel.js"></script>
        </body>

    </html>
