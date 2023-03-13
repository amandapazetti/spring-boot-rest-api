package com.example.Livros.Repository;

import com.example.Livros.models.Livros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrosRepository extends JpaRepository<Livros, Long>{

    Livros findById(long id);
}
