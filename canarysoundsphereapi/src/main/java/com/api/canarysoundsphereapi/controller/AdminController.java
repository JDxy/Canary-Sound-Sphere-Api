package com.api.canarysoundsphereapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.canarysoundsphereapi.model.Admin;
import com.api.canarysoundsphereapi.services.AdminService;


/**
 * Controlador para la gestión de eventos.
 */
@RestController
@RequestMapping("/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/{id}")
    public Optional<Admin> findById(@PathVariable("id") String id) {
        return adminService.findById(id);
    }
    
}
