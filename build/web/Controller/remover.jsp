<%@page import="Persistente.ProdutoDB"%>
<%
String id = request.getParameter("id");

  //Executa ação de exlusão no ProdutoDB
   ProdutoDB.excluir(Integer.parseInt(id));
   response.sendRedirect("../View/remover.jsp?voltou=true");
%>
