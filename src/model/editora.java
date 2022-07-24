/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *6. Sobre as editoras, a livraria precisa de
     * seu código, endereço, telefone de contato, e o nome de seu gerente. 
 * @author jairb
 */
public class editora {

    public static void add(editora e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int idEditora;
    private String nomeEditora;
    private String endereco;
    private String telefone;
    private String gerente;

    public editora() {
    }

    /**
     * 
     * @param idEditora
     * @param nmEditora
     * @param endereco
     * @param telefone
     * @param gerente 
     */
    public editora(int idEditora, String nmEditora, String endereco, String telefone, String gerente) {
        this.idEditora = idEditora;
        this.nomeEditora = nomeEditora;
        this.endereco = endereco;
        this.telefone = telefone;
        this.gerente = gerente;
    }
    
    public int getIdEditora() {
        return idEditora;
    }
    
    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "editora{" + "idEditora=" + idEditora + ", nomeEditora=" + 
                nomeEditora + ", endereco=" + endereco + ", telefone=" + 
                telefone + ", gerente=" + gerente + '}';
    }

    public String getMessage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
