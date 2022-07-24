/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author jairb
 */
public class CClientes {

    ArrayList<Cliente> clientes = new ArrayList<>();
    int idCliente = 1;

    public void mokClientes() {
        Cliente cli = new Cliente();
        cli.setIdCliente(this.addIdCli());
        cli.setNomeCliente("Juventino Florencio");
        cli.setCpf("123");
        cli.setCnpj(null);
        cli.setEnderecoCompleto("Flores da Cunha");
        cli.setTelefone("51 44334433");
        this.addCliente(cli);
        Cliente cli2 = new Cliente();
        cli2.setIdCliente(this.addIdCli());
        cli2.setNomeCliente("Josnelson das Candongas");
        cli2.setCpf(null);
        cli2.setCnpj("321");
        cli2.setEnderecoCompleto("Dorival de Oliveira");
        cli2.setTelefone("51 9 99998888");
        this.addCliente(cli2);
    }

    public int addIdCli() {
            return this.idCliente++;
    }

    public void addCliente(Cliente c) {
        this.clientes.add(c);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Boolean verificaCliente(int idCliente) {
        boolean verCliente = false;
        for (Cliente cli : clientes) {
            if (cli.getIdCliente() == idCliente) {
                verCliente = true;
                System.out.println("Cliente: " + cli.getNomeCliente());
            }
        }
        return verCliente;
    }

    public Cliente pesqCli(int cpfCNPJ, String pesq) {
        Cliente c = new Cliente();
        switch (cpfCNPJ) {
            case 1:
                for (Cliente cli : clientes) {
                    if (cli.getCpf() != null && cli.getCpf().equals(pesq)) {
                        c = cli;
                        break;
                    }
                }
                break;
            case 2:
                for (Cliente cli : clientes) {
                    if (cli.getCnpj() != null && cli.getCnpj().equals(pesq)) {
                        c = cli;
                        break;
                    }
                }
                break;
            default:
                System.out.println("Cliente não Encontrado!!!");
                break;
        }
        return c;
    }

}
