package com.example.Livros.Repository;

import com.example.Livros.models.Autores;
import com.example.Livros.models.Livros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autores, Long>{

    Autores findById(long id);
}
