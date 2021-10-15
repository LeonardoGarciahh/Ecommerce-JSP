<%@page import="Persistente.ProdutoDB"%>
<%
    //Pega os valores enviados no parametro
  String link = request.getParameter("link");
  String nome = request.getParameter("nome");
  String valor = request.getParameter("valor");
  String descricao = request.getParameter("descricao");
  String maxParcelas = request.getParameter("parcelas");
  
  //Executa o metodo de inserção no ProduDB
  ProdutoDB.inserir(nome, Double.parseDouble(valor), descricao, Integer.parseInt(maxParcelas),link);
  response.sendRedirect("../View/adicionar.jsp?voltou=true");
%>