<%@page import="Persistente.ProdutoDB"%>
<%
  String nome = request.getParameter("nome");
  String valor = request.getParameter("valor");
  String descricao = request.getParameter("descricao");
  String maxParcelas = request.getParameter("parcelas");
  String id = request.getParameter("id");
  
    //Executa o metodo de alteração no ProduDB
   ProdutoDB.alterar(nome, Double.parseDouble(valor), descricao, Integer.parseInt(maxParcelas),Integer.parseInt(id));
   response.sendRedirect("../View/AlterarTwo.jsp?voltou=true");
%>