
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    public static Connection ConexaoBD() throws ClassNotFoundException{
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/ecommerce?user=root&password=";
                    con = (Connection) DriverManager.getConnection(url);
        } catch(SQLException e){
            System.out.println(e);
        }
        return con;

    }
}
