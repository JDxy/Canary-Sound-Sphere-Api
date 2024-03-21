package com.api.canarysoundsphereapi.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.api.canarysoundsphereapi.model.Admin;

public interface AdminRepository extends MongoRepository<Admin, String> {
    public abstract Optional<Admin> findById(String id);
}
