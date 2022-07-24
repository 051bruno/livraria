/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jairb
 */
public class Cliente {
    private int idCliente;
    private String nomeCliente;
    private String cpf;
    private String cnpj;
    private String enderecoCompleto;
    private String telefone;

    public Cliente() {
        //Construtor Vazio para acessar os metodos acessores get e set
    }
    
    /**
     * Contrutor Cliente
     * @param idCliente
     * @param nomeCliente
     * @param cpf
     * @param cnpj
     * @param enderecoCompleto
     * @param telefone 
     */
    public Cliente(int idCliente, String nomeCliente, String cpf, String cnpj, String enderecoCompleto, String telefone) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.enderecoCompleto = enderecoCompleto;
        this.telefone = telefone;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    /**
     * @param enderecoCompleto the endereco to set
     */
    
    public void setEnderecoCompleto(String enderecoCompleto) { 
        this.enderecoCompleto = enderecoCompleto;
    }

    /**
     * @param enderecoCompleto the endereco to set
     */
    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return "cliente{" + "idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", cpf=" + cpf + ", cnpj=" + cnpj + ", endereco=" + enderecoCompleto + ", telefone=" + telefone + '}';
    }
    
    
    
}
