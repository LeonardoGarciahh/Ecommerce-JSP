<%@page import="java.security.MessageDigest"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Persistente.UsuarioDB"%>
<%@page import="Dominio.Usuario"%>
<%
    StringBuilder sb = new StringBuilder();
    String senhaHex = "";
    //Pegar valores enviados por parametro
    String login = request.getParameter("login");
    String senha = request.getParameter("senha");
    Boolean aprovado = false;

    //Lista todos os usuarios existentes
    ArrayList<Usuario> usuarios = UsuarioDB.listar();
    Usuario cadaUsuario = null;
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    byte messageDigest[] = md.digest(senha.getBytes("UTF-8"));

    for (byte b : messageDigest) {
        sb.append(String.format("%02X", 0xFF & b));
    }
    senhaHex = sb.toString();
    for (int c = 0; c < usuarios.size(); c++) {
        cadaUsuario = usuarios.get(c);
        String loginAccount = cadaUsuario.getEmail();
        String senhaAccount = cadaUsuario.getSenha();
        //Verifica se o usuario e senha é igual ao cadastrado no banco
        if (login.equalsIgnoreCase(loginAccount) && senhaHex.equals(senhaAccount)) {
            aprovado = true;
            break;
        }
    }
    if (aprovado == true) {
        //Cria sessões logado/Id do usuario
        session.setAttribute("logado", true);
        session.setAttribute("idUser", cadaUsuario.getIdUsuario());
        response.sendRedirect("../index.jsp");
    } else {
        response.sendRedirect("../View/login.jsp");
    }


%>