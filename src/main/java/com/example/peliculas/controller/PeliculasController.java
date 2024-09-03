package com.example.peliculas.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.peliculas.model.Peliculas;
import com.example.peliculas.service.PeliculasService;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/peliculas")
public class PeliculasController {
    @Autowired
    private PeliculasService studentService;

    @GetMapping
    public List<Peliculas> getAllPeliculas(){
        return studentService.getAllPeliculas();
    }
        
    @GetMapping("/{id}")
    public Optional<Peliculas> getPeliculasById(@PathVariable Long id) {
        return studentService.getPeliculasById(id);
    }
}
