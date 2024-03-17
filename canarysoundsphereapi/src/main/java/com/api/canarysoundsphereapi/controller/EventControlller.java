package com.api.canarysoundsphereapi.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
