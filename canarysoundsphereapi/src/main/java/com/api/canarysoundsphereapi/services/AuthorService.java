package com.api.canarysoundsphereapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.canarysoundsphereapi.model.Author;
import com.api.canarysoundsphereapi.repositories.AuthorRepository;

/**
 * Clase que proporciona servicios relacionados con los authors.
 */
@Service
public class AuthorService {

    @Autowired // -> es la inyeccion de dependencias
    private AuthorRepository authorRepository;

    /**
     * Se utiliza para listar authors.
     * 
     * @return Devuelve una lista de todos los authors.
     */
    public ArrayList<Author> findAll() {
        return authorRepository.findAll();
    }

    public Optional<Author> findById(String id) {
        return authorRepository.findById(id);
    }

}
