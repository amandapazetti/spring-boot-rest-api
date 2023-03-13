package com.example.Livros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class LivrosApplication {

	public static void main(String[] args) {

		SpringApplication.run(LivrosApplication.class, args);
	}

}
