package com.api.canarysoundsphereapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.canarysoundsphereapi.model.Event;
import com.api.canarysoundsphereapi.repositories.EventRepository;

/**
 * Clase que proporciona servicios relacionados con los eventos.
 */
@Service
public class EventService {

    @Autowired // -> es la inyeccion de dependencias
    private EventRepository eventRepository;

    /**
     * Se utiliza para listar eventos.
     * 
     * @return Devuelve una lista de todos los eventos.
     */
    public ArrayList<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Optional<Event> findById(String id) {
        return eventRepository.findById(id);
    }

}
