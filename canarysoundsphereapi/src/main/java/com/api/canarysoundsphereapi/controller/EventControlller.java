package com.api.canarysoundsphereapi.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.canarysoundsphereapi.DTO.EventDTO;
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
    @GetMapping("/")
    public ArrayList<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/{id}")
    public Optional<Event> findById(@PathVariable("id") String id) {
        return eventService.findById(id);
    }

    @PostMapping("/addevent")
    public void postRegisterEvent(@RequestBody EventDTO event) {     
        eventService.postRegisterEvent(event);
    }
    
}
