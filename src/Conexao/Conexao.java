package conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author jbferraz
 */
public class Conexao {
    //cria constante com endereço do BD e schema
    private static String url = "jdbc:mysql://localhost:3307/livraria";
    //cria uma constante com user do BD
    private static String user = "root";
    //cria uma constante com senha do BD
    private static String pass = "";
    
    public static Connection getConexao() throws SQLException{
        //Inicia conexão nula, ainda não estabelecida
        Connection c = null;
        
        //tenta estabelecer a conexão
        try {
            c = DriverManager.getConnection(url, user, pass);
            //caso haja alguma falha entra no catch
        } catch (SQLException e) {
            throw new SQLException("Erro ao conectar banco!\n" 
                + e.getMessage());
        }
        return c;
    }
}
