package com.example.Livros.models;


import javax.persistence.*;
import java.io.Serializable;

// Indica que a classe Livros é uma entidade.
@Entity

// Especifica o nome da tabela no banco de dados.
@Table(name="TB_LIVROS")


/*Essa interface Seriazable, permite que objetos da
 classe sejam convertidos em bytes e transportados
 por uma rede ou armazenados em arquivos.*/

public class Livros implements Serializable {

    private static final long serialVersionUID = 1L;

    //indica que esse atributo é a chave primaria
    @Id

    //Gera o valor da chave primária automaticamente pelo banco de dados
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;

    private String titulo;

    private String generoLiterario;

    private String editora;

    private Double preco;

    private Integer numeroDePaginas;

    /*indica que a classe atual tem muitos objetos associados a um objeto de outra classe. */
   @ManyToOne
   private Autores autores;


 /*criando o Gatters e Setters - para permitir que as classes
    controlem como o  seus atributos serão acessados e modificados.*/


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Integer numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public Autores getAutores() {
        return autores;
    }

    public void setAutores(Autores autores) {
        this.autores = autores;
    }

}

