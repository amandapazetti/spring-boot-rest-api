package com.example.Livros.resource;

import com.example.Livros.Repository.LivrosRepository;
import com.example.Livros.models.Livros;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

@Api(value="API REST Web-Autores-Livros")
@CrossOrigin(origins = "*")
@RequestMapping("api/livros")
public class LivrosController {

    /*injeção de dependência para injetar automaticamente
     uma instância de uma classe em outra classe.*/
    @Autowired
    LivrosRepository livrosRepository;

    //Métodos que definem as operações básicas de um Crud.
    @PostMapping
    @ApiOperation(value = "Salva um livro")
    public Livros salvarlivros(@RequestBody Livros livros) {
        return livrosRepository.save(livros);
    }
    @GetMapping
    @ApiOperation(value = "Retorna uma lista de livros")
    public java.util.List<Livros> listaLivros() {
        return livrosRepository.findAll();
    }
    @GetMapping("{id}")
    @ApiOperation(value = "Retorna um unico livro")
    public Optional<Livros> listaLivroUnico(@PathVariable(value = "id") Long id) {
        Optional<Livros> livros = livrosRepository.findById(id);;
        return livros;
    }

    @DeleteMapping
    @ApiOperation(value = "Deleta um livro")
    public void deletaLivro(@RequestBody Livros livros) {
        livrosRepository.delete(livros);
    }

    @PutMapping
    @ApiOperation(value = "Atualiza um livro")
    public Livros atualizaLivro(@RequestBody Livros livros) {

        return livrosRepository.save(livros);
    }
}



