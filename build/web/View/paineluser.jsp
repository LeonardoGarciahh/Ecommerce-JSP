

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
        <jsp:include page="/View/menu.jsp" />
        <div style="border: none;" class="login">
            <h1 style="color: #807C7C"><i style="color:white;text-shadow: 0px 0px 5px gray;"
                                          class="fa fa-user"></i>Lista de pedidos</h1>
            <table class="infos-user">
                <tr>
                    <th>Nome</th>
                    <th>Data de compra</th>
                    <th>Valor</th>
                    <th style="color: red">X</th>
                </tr>
                <%
                    ArrayList<Venda> vendas = VendaDB.listar();
                    String idUsuario = session.getAttribute("idUser").toString();
                    for (int c = 0; c < vendas.size(); c++) {
                        Venda cadaVenda = vendas.get(c);

                        if (cadaVenda.getIdUsuario() == Integer.parseInt(idUsuario) && cadaVenda.getCancelada() != true) {
                            Produto cadaProduto = ProdutoDB.FindById(cadaVenda.getIdProduto());


                %>
                <tr>
                    <td><img src="<%= cadaProduto.getLink()%>" alt=""><%= cadaProduto.getNome()%></td>
                    <td><%= cadaVenda.getDtVenda()%></td>
                    <td><%= cadaVenda.getValor()%></td>
                    <td><form action="../Controller/cancelar.jsp"><input  type="hidden" name="id" value="<%= cadaVenda.getIdVenda()%>"><input type="submit" value="Cancelar"></form></td>
                </tr>
                <%                    }

                    }
                %>
            </table>
        </div>
    </body>

</html>
