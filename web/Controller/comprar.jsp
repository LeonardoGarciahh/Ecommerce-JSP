<%@page import="Dominio.Produto"%>
<%@page import="Persistente.ProdutoDB"%>
<%@page import="Dominio.Usuario"%>
<%@page import="Persistente.UsuarioDB"%>
<%@page import="Persistente.VendaDB"%>
<%@page import="java.sql.Date"%>
<%
    //Pega valores enviado por parametro
  String valor = request.getParameter("valor");
  String idProduto = request.getParameter("idProduto");
  String numbercard = request.getParameter("numbercard");
  //Retirar mascara do cartão
  numbercard = numbercard.replace(" ", "");
  String cvc = request.getParameter("cvc");
  String idUsuario = session.getAttribute("idUser").toString();
  //Pega a data atual
  Date data = new Date(System.currentTimeMillis());
  String dataS = data.toString();
  //Faz busca pela id
  Usuario usuario = UsuarioDB.FindById(Integer.parseInt(idUsuario));
  Produto produto = ProdutoDB.FindById(Integer.parseInt(idProduto));
try{
      //Executa o metodo de inserção na VendaDB
VendaDB.inserir(dataS, usuario, numbercard, Integer.parseInt(cvc), Double.parseDouble(valor), produto);
response.sendRedirect("../index.jsp");
}catch(Exception e){
    out.print(e);
}


%>