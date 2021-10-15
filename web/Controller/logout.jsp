<%
    //Destroi todas as sessões
    session.invalidate();
    response.sendRedirect("../index.jsp");
%>