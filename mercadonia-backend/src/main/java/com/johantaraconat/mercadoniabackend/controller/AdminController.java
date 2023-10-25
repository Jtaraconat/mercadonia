package com.johantaraconat.mercadoniabackend.controller;

import com.johantaraconat.mercadoniabackend.exception.AdminNotFoundException;
import com.johantaraconat.mercadoniabackend.model.Admin;
import com.johantaraconat.mercadoniabackend.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class AdminController {

    //all routes must be protected
    @Autowired
    private AdminRepository adminRepository;

    @PostMapping("/admin")
    Admin newAdmin(@RequestBody Admin newAdmin){
        return adminRepository.save(newAdmin);
    }

    @GetMapping("/admins")
    List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @GetMapping("/admin/{id}")
    Admin getAdminById(@PathVariable long id){
        return adminRepository.findById(id)
                .orElseThrow(()-> new AdminNotFoundException(id));
    }
}