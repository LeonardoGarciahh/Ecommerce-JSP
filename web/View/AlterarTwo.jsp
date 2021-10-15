<%@page import="Persistente.ProdutoDB"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dominio.Produto"%>
<link rel="stylesheet" href="style.css">
<%
    //Pegar produtos do banco
    Produto cadaProduto = null;
    String id = request.getParameter("id");
    if (id != null) {
        cadaProduto = ProdutoDB.FindById(Integer.parseInt(id));
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //Verificar se voltou do controller para atualizar os iframes
    String voltou = request.getParameter("voltou");
    if (voltou != null) {

        if (request.getParameter("voltou").equals("true")) {

%>
<script type="text/javascript">
    window.parent.location.href = "alterar.jsp?voltou=true";
    window.location.href = "AlterarTwo.jsp";
</script>
<%                }
    }
%>
<form style="top: -50px" action="../Controller/alterar.jsp" method="POST">
    <div class="inputs">
        <%
            out.print(id);
        %>
        <label for="">Nome</label>
        <input name="nome" type="text" placeholder="Ex: Pão de queijo" <% if (id != null) {%>value="<%= cadaProduto.getNome()%>"<%}%>>
        <label for="">Valor</label>
        <input name="valor" style="max-width: 150px;" type="number" placeholder="R$0,00" <% if (id != null) {%>value="<%= cadaProduto.getValor()%>"<%}%>>
        <label for="">Maximo de parcelas</label>
        <input name="parcelas" style="max-width: 150px;" type="number" placeholder="Ex: 1" <% if (id != null) {%>value="<%= cadaProduto.getMaxParcelas()%>"<%}%>>
        <label for="">Descrição</label>
        <input name="descricao" type="text" <% if (id != null) {%>value="<%= cadaProduto.getDescricao()%>"<%}%>>
        <input type="hidden" name="id" value="<%=id%>">
        <input onclick="window.parent.alterarFlse()" style="max-width: unset;" type="submit" value="Alterar produto">
    </div>
</form>
