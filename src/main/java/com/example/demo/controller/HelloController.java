package com.example.demo.controller;

import com.example.demo.model.HelloEntity;
import com.example.demo.repository.HelloRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloRepository helloRepository;

    public HelloController(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    @GetMapping("/hello")
    public String getHelloWorld() {
        // Save a HelloEntity instance to the DB
        HelloEntity hello = new HelloEntity("Hello World");
        helloRepository.save(hello);
        return hello.getMessage();
    }
}
