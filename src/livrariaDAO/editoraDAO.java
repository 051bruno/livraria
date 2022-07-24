/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livrariaDAO;

import model.editora;

import conexao.Conexao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Cliente;
import model.editora;


/**
 *
 * @author bruno
 * public class editora {
    private int idEditora;
    private String nomeEditora;
    private String endereco;
    private String telefone;
    private String gerente;

    public editora() {
    }

 */
public class editoraDAO {
    
    public void cadastrarEditora(editora pVO) throws SQLException{
        //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde 
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "insert into pessoa values "
                    + "(null, '" 
                    + pVO.getNomeEditora() + "', '"
                    + pVO.getIdEditora() + "', '"
                    + pVO.getEndereco() + "', '"
                    + pVO.getTelefone() + "', "
                    + pVO.getGerente() + ", ";

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
    
    public ArrayList<editora> listarEditora() throws SQLException{
         //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde 
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "select * from editora";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<editora> editora = new ArrayList<>();
            while(rs.next()){
                editora e = new editora();
                //lado do java |x| lado do BD
                e.setIdEditora(rs.getInt("idEditora"));
                e.setNomeEditora(rs.getString("nomeEditora"));
                e.setTelefone(rs.getString("telefone"));
                e.setGerente(rs.getString("gerente"));

                //popula arrayList
                editora.add(e);
            }
            //retorna arrayList
         
            return editora;
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
    
    public editora getByDoc(String idEditora) throws SQLException{
        //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde 
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();
        editora o = new editora();
        
        try {
            String sql;
            sql = "select * from editora where idEditora = " + idEditora;
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {                
                //lado do java |x| lado do banco
                o.setIdEditora(rs.getInt("idCliente"));
             
                o.setEndereco(rs.getString("endereco"));
                o.setTelefone(rs.getString("telefone"));
                o.setGerente(rs.getString("CPF"));

            }
        } catch (SQLException    vve) {
            throw new SQLException(" esta editora não existe!\n"
                + o.getMessage());
        } finally {
            con.close();
            stat.close();
        }
        return o;
    }
    
    public void deletarEditora(int id) throws SQLException{
        //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde 
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "delete from editora where idEditora = " + id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar Editora . \n"
                + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void atualizarCliente (editora pVO) throws SQLException{
        //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde 
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "update editora set "
                    + "nomeEditora = '" + pVO.getNomeEditora() + "', "
                    + "endereco = '" + pVO.getEndereco() + "', "
                    + "CPF = '" + pVO.getGerente() + "', "               
                    + "Telefone = " + pVO.getTelefone() + " "
                    + "where idEditora= " + pVO.getIdEditora();
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
