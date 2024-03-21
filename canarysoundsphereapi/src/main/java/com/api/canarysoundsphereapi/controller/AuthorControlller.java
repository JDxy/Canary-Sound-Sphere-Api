package com.api.canarysoundsphereapi.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.canarysoundsphereapi.model.Author;
import com.api.canarysoundsphereapi.model.Event;
import com.api.canarysoundsphereapi.services.AuthorService;
import com.api.canarysoundsphereapi.services.EventService;


/**
 * Controlador para la gestión de eventos.
 */
@RestController
@RequestMapping("/authors")
public class AuthorControlller {

    @Autowired
    private AuthorService authorService;

    /**
     * Se utiliza para listar eventos.
     * 
     * @return Devuelve una lista de todos los eventos.
     */
    @GetMapping("/")
    public ArrayList<Author> findAll() {
        return authorService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Author> findById(@PathVariable("id") String id) {
        return authorService.findById(id);
    }
    
}
