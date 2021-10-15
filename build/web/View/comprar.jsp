
<%@page import="java.util.ArrayList"%>
<%@page import="Dominio.Produto"%>
<%@page import="Persistente.ProdutoDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <link rel="stylesheet" href="style.css">
        <title>Document</title>
    </head>

    <body>
        <jsp:include page="/View/menu.jsp" />
        <div class="content">
            <%
                //Pega a id enviada por parametro
                String id = request.getParameter("id");
                //Verifica se a session é nula ou se a id do parametro é nula
                if (id != null && session.getAttribute("idUser") != null) {
                    Produto produto = ProdutoDB.FindById(Integer.parseInt(id));


            %>
            <h1 id="head"><%= produto.getNome()%></h1>
            <div class="img">
                <img src="<%= produto.getLink()%>" alt="">
            </div>

            <form class="infos-pagamento" method="POST" action="../Controller/comprar.jsp">
                <div class="endereco">
                    <h1>Endereço</h1>
                    <div class="input-comprar">
                        <i class="fa fa-map-marker"></i>
                        <input name="cep" id="cep" type="text" placeholder="CEP" onblur="pesquisacep(this.value)" maxlength="8" minlength="8" required>
                    </div>
                    <h2 style="margin-left: 15px;"><span id="rua"></span> <span id="bairro"></span><span id="cidade"></span>
                    </h2>
                </div>

                <h1>Pagamento</h1>
                <div style="display: flex;flex-wrap: wrap;" class="endereco">
                    <div class="payment">
                        <h1></h1>
                        <label for="">Parcelas</label>
                        <select id="parcelas" name="parcelas" id="" onblur="calcular()">
                            <%
                                //Busca no banco o maximo de parcelas para colocar como opção no front-end
                                for (int c = 1; c <= produto.getMaxParcelas(); c++) {
                            %>
                            <option value="<%=c%>"><%=c%></option>
                            <%
                                }
                            %>
                        </select>
                    </div>
                    <div class="payment">
                        <label for="">Quantidade</label>
                        <input id="quantidade" style="width: 50px;padding: 5px" type="number" name="quantidade" value="1" onblur="calcular()">
                    </div>
                </div>
                <h3 style="color: #707070;margin-left: 15px">Valor do produto: R$<%= produto.getValor()%> </h3>
                <h1 style="font-family: impact">Total: <span id="valor">1x de R$1200,00</span></h1>
                <div class="input-comprar">
                    <i class="fa fa-credit-card"></i>
                    <input id="card" type="text" placeholder="Number card" name="numbercard" maxlength="16" minlength="16" required>
                </div>
                <div style="max-width: 250px;display: flex;" class="input-comprar" >
                    <label for="" style="color: #707070;margin-left: 15px;">Data de vencimento</label>
                    <input type="date" required>
                </div>
                <div style="max-width: 130px;" class="input-comprar">
                    <i class="fa fa-credit-card"></i>
                    <input type="text" placeholder="CVC" maxlength="4" minlength="3" required name="cvc">
                </div>
                <input type="hidden" value="valor" name="valor" id="valorTotal">
                <input type="hidden" value="<%= produto.getIdProduto()%>" name="idProduto">
                <input id="confirmar" onclick="return confirm('Deseja realmente comprar?');" type="submit" value="Confirmar compra">
            </form>


        </div>
        <script type="text/javascript" src="cep.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.11/jquery.mask.min.js"></script>
        <script type="text/javascript">
                    //Adiciona mascara a input de cartão e cep
                    $("#card").mask("0000 0000 0000 0000");
                    $("cep").mask("00000-000");

                    //Pega os elementos
                    confirmar = document.getElementById('confirmar');
                    confirmar.addEventListener("onmouseenter", calcular());

                    //Faz o calculo valor * quantidade / produtos
                    function calcular() {
                        parcela = document.getElementById('parcelas').value;
                        textValor = document.getElementById('valor');
                        quantidade = document.getElementById('quantidade').value;
                        valorTotal = document.getElementById('valorTotal');
                        let calc = <%= produto.getValor()%> / parseInt(parcela) * quantidade;
                        console.log(calc);
                        console.log(parcela);
                        textValor.innerHTML = parcela + "x de R$" + calc;
                        valorTotal.value = calc * parcela;
                    }

        </script>
        <%
            } else {
                response.sendRedirect("login.jsp");
            }
        %>
    </body>

</html>
