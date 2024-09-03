package com.example.peliculas.service;
import com.example.peliculas.model.Peliculas;
import java.util.List;
import java.util.Optional;

public interface PeliculasService {
    List<Peliculas> getAllPeliculas();
    Optional<Peliculas> getPeliculasById(Long id);
}
