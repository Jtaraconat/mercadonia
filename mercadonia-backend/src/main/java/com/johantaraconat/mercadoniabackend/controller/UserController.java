package com.johantaraconat.mercadoniabackend.controller;

import com.johantaraconat.mercadoniabackend.exception.AdminNotFoundException;
import com.johantaraconat.mercadoniabackend.exception.CategoryNotFoundException;
import com.johantaraconat.mercadoniabackend.model.User;
import com.johantaraconat.mercadoniabackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"https://mercadona-frontend-61476149f1e5.herokuapp.com/"})
public class UserController {


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

    @DeleteMapping("/admin/{id}")
    String deleteCategory(@PathVariable Integer id){
        if(!userRepository.existsById(id)) {
            throw new CategoryNotFoundException(id);
        }
        userRepository.deleteById(id);
        return "l'admin avec l'id: " + id + " a été supprimé";
    }
}
