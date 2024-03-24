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

    /**
     * Encuentra un evento por su id
     * 
     * @param id
     * @return
     */
    public Optional<Event> findById(String id) {
        return eventRepository.findById(id);
    }

    /**
     * Se utiliza para registrar un nuevo event
     * 
     * @param event
     */
    public void postEvent(Event event) {
        eventRepository.save(event);
    }

    /**
     * Elimina un event por su id
     * 
     * @param id
     */
    public void deleteEvent(String id) {
        eventRepository.deleteById(id);
    }

    /**
     * Actualiza un evento existente.
     * 
     * @param id
     * @param updatedEvent
     */
    public void updateEvent(String id, Event updatedEvent) {
        Optional<Event> existingEvent = eventRepository.findById(id);
        if (existingEvent.isPresent()) { // Verifica si el evento existe
            Event eventToUpdate = existingEvent.get();
            // Actualiza los campos del evento existente con los datos del evento
            // actualizado
            eventToUpdate.setLogo(updatedEvent.getLogo());
            eventToUpdate.setImage(updatedEvent.getImage());
            eventToUpdate.setName(updatedEvent.getName());
            eventToUpdate.setDate(updatedEvent.getDate());
            eventToUpdate.setTime(updatedEvent.getTime());
            eventToUpdate.setCapacity(updatedEvent.getCapacity());
            eventToUpdate.setDescription(updatedEvent.getDescription());
            eventToUpdate.setDirection(updatedEvent.getDirection());
            eventToUpdate.setMarker(updatedEvent.getMarker());
            eventToUpdate.setTicket_store(updatedEvent.getTicket_store());
            // Guarda el evento actualizado en la base de datos
            eventRepository.save(eventToUpdate);
        } else {
            // Manejo de error si el evento no se encuentra
            throw new RuntimeException("No se encontró ningún evento con el ID proporcionado: " + id);
        }
    }

}