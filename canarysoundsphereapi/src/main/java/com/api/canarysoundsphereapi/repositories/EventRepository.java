package com.api.canarysoundsphereapi.repositories;

import java.util.ArrayList;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.api.canarysoundsphereapi.model.Event;

public interface EventRepository extends MongoRepository<Event, String> {
    /**
     * Se utiliza para listar eventos.
     * 
     * @return Devuelve una lista de todos los eventos.
     */
    public abstract ArrayList<Event> findAll();
}
