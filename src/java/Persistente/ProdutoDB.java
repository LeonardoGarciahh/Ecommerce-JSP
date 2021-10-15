package Persistente;

import Conexao.ConexaoDAO;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import Dominio.Produto;
import java.sql.ResultSet;

public class ProdutoDB {

    static PreparedStatement pstm;
    static Connection con;
    static ResultSet rs;
    static ResultSet rs1;

    public static void inserir(String nome, double Valor, String descricao, int maxParcelas, String link) throws ClassNotFoundException {
        con = new ConexaoDAO().ConexaoBD();
        String sql = "INSERT INTO produto values(default, ?,?,?,?,?)";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.setDouble(2, Valor);
            pstm.setString(3, descricao);
            pstm.setInt(4, maxParcelas);
            pstm.setString(5, link);
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            out.print(e);
        }
    }

    public static void excluir(int idproduto) throws SQLException, ClassNotFoundException {
        con = new ConexaoDAO().ConexaoBD();
        String sql = "DELETE FROM produto where idProduto = ?";
        try {

            pstm = con.prepareStatement(sql);
            pstm.setInt(1, idproduto);
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            out.print(e);
        }
    }

    public static void alterar(String nome, double Valor, String descricao, int maxParcelas, int id) throws ClassNotFoundException {
        con = new ConexaoDAO().ConexaoBD();
        String sql = "UPDATE produto set nome = ?, valor = ?, descricao = ?, maxParcela = ? where idProduto = ?";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.setDouble(2, Valor);
            pstm.setString(3, descricao);
            pstm.setInt(4, maxParcelas);
            pstm.setInt(5, id);
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            out.print(e);
        }
    }

    public static ArrayList<Produto> listar() throws ClassNotFoundException {
        con = new ConexaoDAO().ConexaoBD();
        String sql = "SELECT * FROM produto";
        ArrayList<Produto> lista = new ArrayList<Produto>();;
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery(sql);
            while (rs.next()) {
                Produto obj = new Produto(rs.getString("nome"), rs.getDouble("valor"), rs.getString("descricao"), rs.getInt("maxParcela"), rs.getInt("idProduto"), rs.getString("link"));
                lista.add(obj);
            }
        } catch (SQLException e) {
            out.print(e);
        }
        return lista;
    }

    public static Produto FindById(int id) throws ClassNotFoundException {
        ArrayList<Produto> list = listar();
        Produto cadaProduto = null;
        for (int c = 0; c < list.size(); c++) {
            cadaProduto = list.get(c);
            String idProduto = Integer.toString(cadaProduto.getIdProduto());
            if (id == cadaProduto.getIdProduto()) {
                return cadaProduto;
            }
        }
        return null;
    }

    public static ArrayList<Produto> FindByName(String nome) throws ClassNotFoundException {
        con = new ConexaoDAO().ConexaoBD();
        String sql = "SELECT * FROM produto where nome like '%"+nome+"%'";
        ArrayList<Produto> lista = new ArrayList<Produto>();;
        try {
            pstm = con.prepareStatement(sql);
            rs1 = pstm.executeQuery(sql);
            while (rs1.next()) {
                Produto obj = new Produto(rs1.getString("nome"), rs1.getDouble("valor"), rs1.getString("descricao"), rs1.getInt("maxParcela"), rs1.getInt("idProduto"), rs1.getString("link"));
                lista.add(obj);
            }
        } catch (SQLException e) {
            out.print(e);
        }
        return lista;
    }

}
