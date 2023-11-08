package com.johantaraconat.mercadoniabackend.controller;

import com.johantaraconat.mercadoniabackend.exception.AdminNotFoundException;
import com.johantaraconat.mercadoniabackend.model.User;
import com.johantaraconat.mercadoniabackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    //all routes must be protected
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/admin")
    User newAdmin(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/admins")
    List<User> getAllAdmins() {
        return userRepository.findAll();
    }

    @GetMapping("/admin/{id}")
    User getAdminById(@PathVariable Integer id){
        return userRepository.findById(id)
                .orElseThrow(()-> new AdminNotFoundException(id));
    }
}