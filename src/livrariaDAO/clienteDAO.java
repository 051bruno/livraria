
package livrariaDAO;

import model.Cliente;

import conexao.Conexao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Cliente;



/**
 *
 * @author bruno
 */
public class clienteDAO {

    public void cadastrarCliente(Cliente pVO) throws SQLException{
        //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde 
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "insert into pessoa values "
                    + "(null, '" 
                    + pVO.getNomeCliente() + "', '"
                    + pVO.getCpf() + "', '"
                    + pVO.getEnderecoCompleto() + "', '"
                    + pVO.getTelefone() + "', "
                    + pVO.getCpf() + ", "
                    + pVO.getCnpj() + ");";
            //vamos executar no BD o SQl criado acima
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir Pessoa! \n"
                + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public ArrayList<Cliente> listarClientes() throws SQLException{
         //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde 
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "select * from pessoa";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<Cliente> clientes = new ArrayList<>();
            while(rs.next()){
                Cliente c = new Cliente();
                //lado do java |x| lado do BD
                c.setIdCliente(rs.getInt("idPessoa"));
                c.setNomeCliente(rs.getString("nomePessoa"));
                c.setCpf(rs.getString("cpf"));
                c.setEnderecoCompleto(rs.getString("endereco"));
                c.setTelefone(rs.getString("telefone"));
                c.setCpf(rs.getString("idade"));
                c.setCnpj(rs.getString("Cnpj"));
                //popula arrayList
                clientes.add(c);
            }
            //retorna arrayList
            return clientes;
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar pessoas!\n" +
                    e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public boolean verCPF(String cpf) throws SQLException{
        //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde 
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();
        
        boolean verCPF = false;
        
        try {
            String sql;
            sql = "select cpf from pessoa where cpf = " + cpf;
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {                
                verCPF = rs.wasNull();
            }
        } catch (SQLException e) {
            throw new SQLException("Pessoa com este CPF não existe! \n"
                + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
        return verCPF;
    }
    
        public boolean verCnpj(String cnpj) throws SQLException{
        //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde 
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();
        
        boolean verCnpj = false;
        
        try {
            String sql;
            sql = "select cpf from pessoa where cnpj = " + cnpj;
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {                
                verCnpj = rs.wasNull();
            }
        } catch (SQLException e) {
            throw new SQLException("CNPJ inexistente! \n"
                + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
        return verCnpj;
    }
    
    public Cliente getByDoc(String cpf) throws SQLException{
        //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde 
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();
        Cliente c = new Cliente();
        
        try {
            String sql;
            sql = "select * from pessoa where cpf = " + cpf;
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {                
                //lado do java |x| lado do banco
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNomeCliente(rs.getString("nomeCliente"));
                c.setEnderecoCompleto(rs.getString("endereco"));
                c.setTelefone(rs.getString("telefone"));
                c.setCpf(rs.getString("CPF"));
                c.setCnpj(rs.getString("CNPJ"));
            }
        } catch (SQLException e) {
            throw new SQLException("Pessoa com este cpf não existe!\n"
                + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
        return c;
    }
    
    public void deletarCliente(int id) throws SQLException{
        //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde 
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "delete from pessoa where idPessoa = " + id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar Pessoa. \n"
                + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void atualizarCliente (Cliente pVO) throws SQLException{
        //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde 
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "update pessoa set "
                    + "nomeCliente = '" + pVO.getNomeCliente() + "', "
                    + "endereco = '" + pVO.getEnderecoCompleto() + "', "
                    + "CPF = '" + pVO.getCpf() + "', "
                    + "CNPJ = " + pVO.getCnpj() + " "
                    + "Telefone = " + pVO.getTelefone() + " "
                    + "where idPessoa = " + pVO.getIdCliente();
            stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar Pessoa. \n"
                +e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    
    
}
