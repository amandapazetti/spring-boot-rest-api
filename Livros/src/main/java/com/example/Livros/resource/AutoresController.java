package com.example.Livros.resource;

import com.example.Livros.Repository.AutorRepository;
import com.example.Livros.models.Autores;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value="API REST AUTORES")

@CrossOrigin(origins = "*")

@RequestMapping("api/autores")
public class AutoresController {


    /*injeção de dependência para injetar automaticamente
     uma instância de uma classe em outra classe.*/
    @Autowired
    AutorRepository autorRepository;


    //Métodos que definem as operações básicas de um Crud.
    @PostMapping
    @ApiOperation(value = "Salva um autor")
    public Autores salvarautor(@RequestBody Autores autores) {
        return autorRepository.save(autores);
    }

    @GetMapping
    @ApiOperation(value = "Retorna uma lista de autores")
    public List<Autores> listaAutores() {
        return autorRepository.findAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Retorna um unico autor")
    public Autores listaAutorUnico(@PathVariable(value = "id") long id) {
        return autorRepository.findById(id);
    }

    @DeleteMapping
    @ApiOperation(value = "Deleta um autor")
    public void deletaAutor(@RequestBody Autores autores) {
        autorRepository.delete(autores);
    }

    @PutMapping
    @ApiOperation(value = "Atualiza um autor")
    public Autores atualizaAutor(@RequestBody Autores autores) {
        return autorRepository.save(autores);
    }

}
