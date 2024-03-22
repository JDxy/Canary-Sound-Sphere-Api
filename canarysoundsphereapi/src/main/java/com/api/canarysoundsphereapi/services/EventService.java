package com.api.canarysoundsphereapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.canarysoundsphereapi.DTO.EventDTO;
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

    public void postRegister(EventDTO eventDTO) {
        Event event = new Event();
            event.set_id(eventDTO.get_id());
            event.setLogo(eventDTO.getLogo());
            event.setImage(eventDTO.getImage());
            event.setName(eventDTO.getName());
            event.setDate(eventDTO.getDate());
            event.setTime(eventDTO.getTime());
            event.setCapacity(eventDTO.getCapacity());
            event.setDescription(eventDTO.getDescription());
            event.setDirection(eventDTO.getDirection());
            event.setMarker(eventDTO.getMarker());
            event.setTicket_store(eventDTO.getTicket_store());
            eventRepository.save(event);      
    }

    public void delete(String id){
        eventRepository.deleteById(id);
    }

    public void modify(String id, EventDTO eventDTO) {
        Event event = eventRepository.findByCode(id);
        if (event != null) {
            event.setLogo(eventDTO.getLogo());
            eventRepository.save(event);
        } 
    }
}
