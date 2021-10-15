
package Dominio;

import java.util.Date;

public class Venda {
    private String dtVenda;
    private int idUsuario;
    private String cartao;
    private int codSeguranca;
    private double valor;
    private int idProduto;
    private Boolean cancelada;
    private int idVenda;

    public Venda(String dtVenda, int usuario, String cartao, int codSeguranca, double valor, int produto,Boolean cancelada,int idVenda) {
        this.dtVenda = dtVenda;
        this.idUsuario = usuario;
        this.cartao = cartao;
        this.codSeguranca = codSeguranca;
        this.valor = valor;
        this.idProduto = produto;
        this.cancelada = cancelada;
        this.idVenda = idVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public Boolean getCancelada() {
        return cancelada;
    }

    public void setCancelada(Boolean cancelada) {
        this.cancelada = cancelada;
    }

    
    
    public String getDtVenda() {
        return dtVenda;
    }

    public void setDtVenda(String dtVenda) {
        this.dtVenda = dtVenda;
    }

    public int getUsuario() {
        return idUsuario;
    }

    public void setUsuario(int usuario) {
        this.idUsuario = usuario;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public int getCodSeguranca() {
        return codSeguranca;
    }

    public void setCodSeguranca(int codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getProduto() {
        return idProduto;
    }

    public void setProduto(int produto) {
        this.idProduto = produto;
    }
    
    
}
