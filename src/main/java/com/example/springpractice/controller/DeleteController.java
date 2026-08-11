package com.example.springpractice.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/delete-api")
public class DeleteController {

    // http://localhost:8080/api/v1/delete-api/{variable}
    @DeleteMapping(value="/{variable}")
    public String deleteVariable(@PathVariable String variable) {
        return variable;
    }
}
