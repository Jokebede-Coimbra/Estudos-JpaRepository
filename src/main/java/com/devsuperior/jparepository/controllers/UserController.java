package com.devsuperior.jparepository.controllers;

import com.devsuperior.jparepository.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    public ResponseEntity<List<User>> findAll() {
        List<User> result = repository.findAll();
        return  ResponseEntity.ok(result);
    }
}
