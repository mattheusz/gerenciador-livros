/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * Trabalho de JAVA 
 * Autores: Guilherme Muniz / Mateus Justino
 */
public class Livro {
    
    private int id_livro;
    private String foto;
    private String titulo;
    private String descricao;
    private String autor;
    private String editora;
    private String isbn;
    private int paginas;
    private int pag_lidas;
    private String adquirido;

    public Livro() {
    }
     public Livro(String foto, String titulo,
                  String descricao, String autor, String editora, 
                    String isbn, int paginas, int pag_lidas, String adquirido) {
        this.foto = foto;
        this.titulo = titulo;
        this.descricao = descricao;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.paginas = paginas;
        this.pag_lidas = pag_lidas;
        this.adquirido = adquirido;
    }
    
    public Livro(int id_livro, String foto, String titulo,
                 String descricao, String autor, String editora, 
                 String isbn, int paginas, int pag_lidas, String adquirido) {
        
        this.id_livro = id_livro;
        this.foto = foto;
        this.titulo = titulo;
        this.descricao = descricao;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.paginas = paginas;
        this.pag_lidas = pag_lidas;
        this.adquirido = adquirido;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPag_lidas() {
        return pag_lidas;
    }

    public void setPag_lidas(int pag_lidas) {
        this.pag_lidas = pag_lidas;
    }

    public String getAdquirido() {
        return adquirido;
    }

    public void setAdquirido(String adquirido) {
        this.adquirido = adquirido;
    }

    @Override
    public String toString() {
        return "Livro{" + "id_livro=" + id_livro + ", foto=" + foto + ", titulo=" + titulo + 
                ", descricao=" + descricao + ", autor=" + autor + ", editora=" + editora + 
                ", isbn=" + isbn + ", paginas=" + paginas + ", pag_lidas=" + pag_lidas + 
                ", status=" + adquirido + '}';
    }
   
    
    
    
}
