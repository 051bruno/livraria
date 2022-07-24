/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livrariaDAO;

/**
 *
 * @author bruno
 */
public class DAOFactory {
    private static clienteDAO cDAO = new clienteDAO();
    private static editoraDAO eDAO = new editoraDAO();
    private static livroDAO lDAO =  new livroDAO();
    private static vendaLivroDAO vDAO = new vendaLivroDAO();
    
}
