package com.example.peliculas.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.peliculas.model.Peliculas;
import com.example.peliculas.repository.PeliculasRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculasServiceImpl implements PeliculasService{
    @Autowired
    private PeliculasRepository peliculasRepository;

    @Override
    public List<Peliculas> getAllPeliculas() {
        return peliculasRepository.findAll();
    }

    @Override
    public Optional<Peliculas> getPeliculasById(Long id) {
        return peliculasRepository.findById(id);
    }
}
