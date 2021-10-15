<%@page import="java.security.MessageDigest"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Persistente.UsuarioDB"%>
<%
    StringBuilder sb = new StringBuilder();
    String senhaHex = "";
    try {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/aaaa");
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        //Retira a mascara do cpf
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        String telefone = request.getParameter("telefone");
        String senha = request.getParameter("senha");
        String sexo = request.getParameter("sexo");
        String dataS = request.getParameter("date");
        String email = request.getParameter("email");
//Retira a mascara do telefone  
        telefone = telefone.replace("(", "");
        telefone = telefone.replace(")", "");
        telefone = telefone.replace(" ", "");
        telefone = telefone.replace("-", "");
        int sexoi = Integer.parseInt(sexo);
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte messageDigest[] = md.digest(senha.getBytes("UTF-8"));

        for (byte b : messageDigest) {
            sb.append(String.format("%02X", 0xFF & b));
        }
        senhaHex = sb.toString();
        //Insere o usuario no banco
        UsuarioDB.inserir(senhaHex, nome, cpf, dataS, email, sexoi, telefone);
    } catch (Exception e) {
        out.print(e);
    }
    response.sendRedirect("../View/login.jsp");
%>