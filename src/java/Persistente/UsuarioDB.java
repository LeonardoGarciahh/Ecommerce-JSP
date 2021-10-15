package Persistente;

import Conexao.ConexaoDAO;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import Dominio.Produto;
import Dominio.Usuario;
import static Persistente.ProdutoDB.listar;
import java.sql.Date;
import java.sql.ResultSet;

public class UsuarioDB {

    static PreparedStatement pstm;
    static Connection con;
    static ResultSet rs;
    public static void inserir(String senha, String nome, String cpf, String DtNascimento, String email, int sexo, String telefone) throws ClassNotFoundException {
        con = new ConexaoDAO().ConexaoBD();
        String sql = "INSERT INTO usuarios values(default, ?,?,?,?,?,?,?)";
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.setString(2, email);
            pstm.setString(3, senha);
            pstm.setString(4, cpf);
            pstm.setString(5, DtNascimento);
            pstm.setInt(6, sexo);
            pstm.setString(7, telefone);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            out.print(e);
        }
    }

    public static void excluir(int idusuario) throws SQLException, ClassNotFoundException {
        con = new ConexaoDAO().ConexaoBD();
        String sql = "DELETE FROM usuarios where idUsuario = ?";
        try {

            pstm = con.prepareStatement(sql);
            pstm.setInt(1, idusuario);
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            out.print(e);
        }
    }

    public static void alterar(String senha, String nome, String cpf, Date DtNascimento, String email, int sexo, int telefone) throws ClassNotFoundException {
        con = new ConexaoDAO().ConexaoBD();
        String sql = "UPDATE usuarios set nome = ?, email = ?, senha = ?, cpf = ?, dtNascimento = ?, sexo = ?, telefone = ?";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.setString(2, email);
            pstm.setString(3, senha);
            pstm.setString(4, cpf);
            pstm.setDate(4, DtNascimento);
            pstm.setInt(4, sexo);
            pstm.setInt(4, telefone);
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            out.print(e);
        }
    }
    public static ArrayList<Usuario> listar() throws ClassNotFoundException{
        con = new ConexaoDAO().ConexaoBD();
        String sql = "SELECT * FROM usuarios";
        ArrayList<Usuario> lista = new ArrayList<Usuario>();;
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery(sql);
            while(rs.next()){
                Usuario obj = new Usuario(rs.getString("senha"),rs.getString("nome"), rs.getString("cpf"), rs.getString("dtNascimento"),rs.getString("email"),rs.getInt("sexo"), rs.getString("telefone"), rs.getInt("idUsuario"));
                lista.add(obj);
            }
        } catch (Exception e) {
            out.print(e);
        }
        return lista;
    }
        public static Usuario FindById(int id) throws ClassNotFoundException {
        ArrayList<Usuario> list = listar();
        Usuario cadaUsuario = null;
        for (int c = 0; c < list.size(); c++) {
            cadaUsuario = list.get(c);
            String idUsuario = Integer.toString(cadaUsuario.getIdUsuario());
            if (id == cadaUsuario.getIdUsuario()) {
                return cadaUsuario;
            }
        }
        return null;
    }
}
