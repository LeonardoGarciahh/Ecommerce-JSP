package Persistente;

import Conexao.ConexaoDAO;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import Dominio.Produto;
import Dominio.Usuario;
import Dominio.Venda;
import java.sql.ResultSet;
import java.sql.Date;

public class VendaDB {

    static PreparedStatement pstm;
    static Connection con;
    static ResultSet rs;
    public static void inserir(String dtVenda, Usuario usuario, String cartao, int codSeguranca, double valor, Produto produto) throws ClassNotFoundException {
        con = new ConexaoDAO().ConexaoBD();
        String sql = "INSERT INTO venda values(default, ?,?,?,?,?,?,?)";
        System.out.print(usuario.getIdUsuario());
        System.out.print(produto.getIdProduto());
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, dtVenda);
            pstm.setInt(2, usuario.getIdUsuario());
            pstm.setString(3, cartao);
            pstm.setInt(4, codSeguranca);
            pstm.setDouble(5, valor);
            pstm.setInt(6, produto.getIdProduto());
            pstm.setBoolean(7, false);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            out.print(e);
        }
    }

    public static void excluir(int idvenda) throws SQLException, ClassNotFoundException {
        con = new ConexaoDAO().ConexaoBD();
        String sql = "DELETE FROM venda where idVenda = ?";
        try {

            pstm = con.prepareStatement(sql);
            pstm.setInt(1, idvenda);
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            out.print(e);
        }
    }
    public static ArrayList<Venda> listar() throws ClassNotFoundException{
        con = new ConexaoDAO().ConexaoBD();
        String sql = "SELECT * FROM venda";
        ArrayList<Venda> listaVenda = new ArrayList<Venda>();
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery(sql);
            while(rs.next()){
                Venda obj = new Venda(rs.getString("date"), rs.getInt("idUsuario"), rs.getString("cartao"), rs.getInt("codSeguranca"), rs.getDouble("valor"), rs.getInt("idProduto"),rs.getBoolean("cancelada"),rs.getInt("idVenda"));
                listaVenda.add(obj);
            }
        } catch (Exception e) {
            out.print(e);
        }
        return listaVenda;
    }
    public static void cancelar(int id) throws ClassNotFoundException, SQLException{
        con = new ConexaoDAO().ConexaoBD();
        String sql = "UPDATE venda set cancelada = ? where idVenda = ?";
        pstm = con.prepareStatement(sql);
        pstm.setBoolean(1, true);
        pstm.setInt(2, id);
        pstm.execute();
        pstm.close();
    }
}
