/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livrariaDAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.livro;

/**
 *
 * @author bruno
 */
class livroDAO {
     public void cadastrarLivro(livro pVO) throws SQLException{
        //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde 
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "insert into livro values "
                    + "(null, '" 
                    + pVO.getIdLivro() + "', '"
                    + pVO.getTituloLivro() + "', '"
                    + pVO.getAutor() + "', '"
                    + pVO.getAssunto() + "', "
                    + pVO.getIsbn() + ", "
                    + pVO.getValor() + ");"
                    + pVO.getIdEditora() + ", ";
            //vamos executa r no BD o SQl criado acima
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir Pessoa! \n"
                + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public ArrayList<livro> listarLivros() throws SQLException{
         //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde 
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "select * from pessoa";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList <livro> livros = new ArrayList<>();
            while(rs.next()){
                livro l = new livro();
                //lado do java |x| lado do BD
                l.setIdLivro(rs.getInt("idLivro"));
                l.setTituloLivro(rs.getString("TituloLivro"));
                l.setIsbn(rs.getString("Isbn"));
                l.setAssunto(rs.getString("Assunto"));
                l.setValor(rs.getInt("Valor"));
                l.setIdEditora(rs.getInt("idade"));
                l.setEstoque(rs.getInt("Estoque"));
                //popula arrayList
                livros.add(l);
            }
            //retorna arrayList
            return livros;
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar livro!\n" +
                    e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }

    
    public void atualizarLivro(livro pVO) throws SQLException{
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
