<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="menu-superior">
    <ul>
        <li ><a href="/Ecommerce/index.jsp" id="logo">E-commerce</a></li>
        <li > <form style="display: flex" method="GET" action="/Ecommerce/index.jsp?"> <input id="search" type="text" name="search" id=""><button style="border: none" type="submit"><i id="iSearch" class="fa fa-search"></i></button></form></li>
                <%
                    if (session.getAttribute("idUser") != null) {
                %>
        <li style="max-width: 50px"> <a href="/Ecommerce/View/paineluser.jsp"><i style = "color: white" class="fa fa-user"></i > </a></li> 
        <li> <a href="/Ecommerce/View/painel.jsp"><i style ="color: white" class="fa fa-gear"></i ></a> </li> 
            <%
                }
            %>
        <li ><% if (session.getAttribute("idUser") == null) { %><a href="/Ecommerce/View/login.jsp" id="btn">Entrar</a><% } else { %><a href="/Ecommerce/Controller/logout.jsp" id="btn">Sair</a><%}%></li>
    </ul>
</nav>
