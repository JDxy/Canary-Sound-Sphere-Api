package com.api.canarysoundsphereapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.canarysoundsphereapi.model.Admin;
import com.api.canarysoundsphereapi.repositories.AdminRepository;

/**
 * Clase que proporciona servicios relacionados con los admins.
 */
@Service
public class AdminService {

    @Autowired // -> es la inyeccion de dependencias
    private AdminRepository adminRepository;

    public Optional<Admin> findById(String id) {
        return adminRepository.findById(id);
    }

}
