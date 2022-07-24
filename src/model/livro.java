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
public class livro {

    private int idLivro;
    private String tituloLivro;
    private String autor;
    private String assunto;
    private String isbn;
    private int estoque;
    private float valor;
    private int idEditora;

    public livro() {
    }

    public livro(int idLivro, String tituloLivro, String isbn, String assunto, String autor, int estoque, float preco, int idEditora) {
        this.idLivro = idLivro;
        this.tituloLivro = tituloLivro;
        this.isbn = isbn;
        this.assunto = assunto;
        this.autor = autor; 
        this.estoque = estoque;
        this.valor = valor;
        this.idEditora = idEditora;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

 
    
    public int getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    @Override
    public String toString() {
        return "livro{" + "idLivro=" + idLivro + ", titulo=" + tituloLivro + ", autor=" + autor + ", assunto=" + assunto + ", isbn=" + isbn + ", estoque=" + estoque + ", valor=" + valor + ", idEditora=" + idEditora + '}';
    }

}
