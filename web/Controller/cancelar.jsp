<%@page import="Persistente.VendaDB"%>
<%
  String id = request.getParameter("id");
    //Executa o metodo de cancelamento na VendaDB
  VendaDB.cancelar(Integer.parseInt(id));
  response.sendRedirect("../View/paineluser.jsp");
%>