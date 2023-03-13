package com.example.Livros.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Indica que a classe Autores é uma entidade.
@Entity

// Especifica o nome da tabela no banco de dados
@Table(name = "TB_AUTORES")

/*Essa interface Seriazable, permite que objetos da
 classe sejam convertidos em bytes e transportados
 por uma rede ou armazenados em arquivos.*/

public class Autores implements Serializable {

    private static final long serialVersionUID = 1L;

    //indica que esse atributo é a chave primaria
    @Id

    //Gera o valor da chave primária automaticamente pelo banco de dados
    @GeneratedValue(strategy = GenerationType.AUTO)

   // chave primária da entidade, representando um
    // identificador exclusivo para cada registro na
    // tabela

    private long id;

    private  String nome;

    private String bibliografia;


/*relação de associação entre duas classes, usando o paradigma de mapeamento objeto-relacional (ORM).*/
    @OneToMany(mappedBy = "autores")
    /*indica que esse campo deve ser ignorado durante a serialização de um objeto em JSON.*/
    @JsonIgnore
    private List<Livros> livros = new ArrayList<>();

    /*criando o Gatters e Setters - para permitir que as classes
    controlem como seus atributos são acessados e modificados.*/


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

    public List<Livros> getLivros() {
        return livros;
    }

    public void setLivros(List<Livros> livros) {
        this.livros = livros;
    }


}
