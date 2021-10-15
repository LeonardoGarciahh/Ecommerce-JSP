
package Dominio;

public class Produto {
    private String nome;
    private double Valor;
    private String descricao;
    private int maxParcelas;
    private int idProduto;
    private String link;

    public Produto(String nome, double Valor, String descricao, int maxParcelas, int id,String link) {
        this.nome = nome;
        this.Valor = Valor;
        this.descricao = descricao;
        this.maxParcelas = maxParcelas;
        this.idProduto = id;
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getMaxParcelas() {
        return maxParcelas;
    }

    public void setMaxParcelas(int maxParcelas) {
        this.maxParcelas = maxParcelas;
    }
    
    
}
