package com.api.canarysoundsphereapi.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.canarysoundsphereapi.model.Event;
import com.api.canarysoundsphereapi.services.EventService;

/**
 * Controlador para la gestión de eventos.
 */
@RestController
@RequestMapping("/events")
public class EventControlller {

    @Autowired
    private EventService eventService;

    /**
     * Se utiliza para listar eventos.
     * 
     * @return Devuelve una lista de todos los eventos.
     */
    @GetMapping()
    public ArrayList<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    /**
     * Método para buscar events por id
     * 
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Optional<Event> findById(@PathVariable("id") String id) {
        return eventService.findById(id);
    }

    @PostMapping("add_event")
    /**
     * Método para registrar un nuevo viaje.
     * 
     * @param viaje La información del nuevo viaje.
     */
    public void postEvent(@RequestBody Event event) {
        eventService.postEvent(event);
    }

    /**
     * Método para eliminar un event
     * 
     * @param id
     */
    @DeleteMapping("/delete/{id}")
    public void deleteEvent(@PathVariable("id") String id) {
        eventService.deleteEvent(id);
    }

    @PutMapping("/update/{id}")
    /**
     * Método para actualizar un evento existente.
     * 
     * @param id    El ID del evento que se va a actualizar.
     * @param event La información actualizada del evento.
     */
    public void updateEvent(@PathVariable("id") String id, @RequestBody Event event) {
        eventService.updateEvent(id, event);
    }


}
