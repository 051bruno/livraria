/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.util.ArrayList;
import model.livro;

/**
 *
 * @author jairb
 */
public class CLivros {

    ArrayList<livro> livros = new ArrayList<>();
    int idLiv = 1;

    public void mokLivros() {
        livro liv = new livro();
        liv.setIdLivro(this.addIdLiv());
        liv.setTituloLivro("Pequeno Principe");
        liv.setAssunto("Ludico");
        liv.setAutor("Eu");
        liv.setIsbn("123123");
        liv.setIdEditora(1);
        liv.setEstoque(10);
        liv.setValor((float) 1.5);
        this.addLivro(liv);
        livro liv2 = new livro();
        liv2.setIdLivro(this.addIdLiv());
        liv2.setTituloLivro("Steve Jobs");
        liv2.setAssunto("Biografia");
        liv2.setAutor("Walter Isaacson");
        liv2.setIsbn("978-85-359-1971-4");
        liv2.setIdEditora(2);
        liv2.setEstoque(20);
        liv2.setValor((float) 35);
        this.addLivro(liv2);
        livro liv3 = new livro();
        liv3.setIdLivro(this.addIdLiv());
        liv3.setTituloLivro("Peixe");
        liv3.setAssunto("Business");
        liv3.setAutor("Stephen");
        liv3.setIsbn("85-352-0711-2");
        liv3.setIdEditora(1);
        liv3.setEstoque(10);
        liv3.setValor((float) 25);
        this.addLivro(liv3);
    }
    
    public int addIdLiv(){
        return this.idLiv++;
    }

    public void addLivro(livro l) {
        this.livros.add(l);
    }

    public ArrayList<livro> getLivros() {
        return livros;
    }

    public Boolean verificaLivro(int idLivro) {
        boolean verLivro = false;
        for (livro livro1 : livros) {
            if (livro1.getIdLivro() == idLivro) {
                verLivro = true;
                System.out.println("Livro: " + livro1.getTituloLivro());
            }
        }
        return verLivro;
    }

    public Boolean verEstoqueLivro(int idLivro, int qtd) {
        boolean verEstoqueLivro = false;
        for (livro Estoqueliv : livros) {
            if (Estoqueliv.getIdLivro() == idLivro && Estoqueliv.getEstoque() >= qtd) {
                verEstoqueLivro = true;
            } else if (Estoqueliv.getIdLivro() == idLivro) {
                System.out.println("Estoque atual: " + Estoqueliv.getEstoque());
            }
        }
        return verEstoqueLivro;
    }

    public void atualizaEstoqueLivro(int idLivro, int qtd) {
        for (livro upEstoqueLivro : livros) {
            if (upEstoqueLivro.getIdLivro() == idLivro) {
                int upEstoque = upEstoqueLivro.getEstoque() - qtd;
                upEstoqueLivro.setEstoque(upEstoque);
                System.out.println("Estoque novo: " + upEstoqueLivro.getEstoque());
            }
        }
    }

    public float verPrecoLivro(int idLivro) {
        float preco = 0;
        for (livro prLivro : livros) {
            if (prLivro.getIdLivro() == idLivro) {
                preco = prLivro.getValor();
            }
        }
        return preco;
    }

    public int verEstoque(int idLivro) {
        int estoqueAtual = 0;
        for (livro prLivro : livros) {
            if (prLivro.getIdLivro() == idLivro) {
                estoqueAtual = prLivro.getEstoque();
            }
        }
        return estoqueAtual;
    }

}
