package com.example.demo.controller;

import com.example.demo.entidades.Categoria;
import com.example.demo.entidades.Pregunta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriviaController {

    @GetMapping("/categories")
    public Categoria[] getCategories() {
        Categoria cat = new Categoria();
        cat.setCategory("Arte");
        cat.setDescription("Preguntas relacionadas con arte, literatura, musica y otras expresiones culturales.");

        Categoria cat2 = new Categoria();
        cat2.setCategory("Deportes");
        cat2.setDescription("Preguntas relacionadas a los deportes");

        Categoria[] categorias = new Categoria[2];
        categorias[0] = cat;
        categorias[1] = cat2;

        return categorias;
    }


    @GetMapping("/question")
    public Pregunta getQuestion() {

        Pregunta pregunta = new Pregunta();

            pregunta.setCategory("Arte");
            pregunta.setQuestion("¿Quién es Picasso?");
            String[] option = new String[3];
            option[0] = "Un pintor";
            option[1] = "Un jugador de fútbol";
            option[2] = "Un filósofo del siglo XIX";
            pregunta.setOptions(option);
            pregunta.setAnswer("La respuesta correcta es la 1");
            pregunta.setExplanation("Picasso fue un famoso pintor");


        return pregunta;
    }
}
