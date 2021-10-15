

<%@page import="Dominio.Usuario"%>
<%@page import="Persistente.UsuarioDB"%>
<%@page import="Dominio.Produto"%>
<%@page import="Persistente.ProdutoDB"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dominio.Venda"%>
<%@page import="Persistente.VendaDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <title>Document</title>
    </head>

    <body>
        <div style="border: none;" class="login">
            <h1 style="color: #807C7C"><i style="color:white;text-shadow: 0px 0px 5px gray;"
                                          class="fa fa-user"></i>Lista de vendas</h1>
            <table class="infos-user">
                <tr>
                    <th>Nome do produto</th>
                    <th>Nome do usuario</th>
                    <th>Data de compra</th>
                    <th>Valor</th>
                </tr>
                <%
                    ArrayList<Venda> vendas = VendaDB.listar();
                    String idUsuario = session.getAttribute("idUser").toString();
                    for (int c = 0; c < vendas.size(); c++) {
                        Venda cadaVenda = vendas.get(c);

                        Produto cadaProduto = ProdutoDB.FindById(cadaVenda.getIdProduto());
                        Usuario cadaUsuario = UsuarioDB.FindById(cadaVenda.getIdUsuario());
                %>
                <tr>
                    <td <% if(cadaVenda.getCancelada() == true){%> style="color: red;text-decoration: line-through" <% }%>><img src="<%= cadaProduto.getLink()%>" alt=""><%= cadaProduto.getNome()%></td>
                    <td <% if(cadaVenda.getCancelada() == true){%> style="color: red;text-decoration: line-through" <% }%>><%= cadaUsuario.getNome()%></td>
                    <td <% if(cadaVenda.getCancelada() == true){%> style="color: red;text-decoration: line-through" <% }%>><%= cadaVenda.getDtVenda()%></td>
                    <td <% if(cadaVenda.getCancelada() == true){%> style="color: red;text-decoration: line-through" <% }%>><%= cadaVenda.getValor()%></td>
                </tr>
                <%

                    }
                %>
            </table>
        </div>
    </body>

</html>
