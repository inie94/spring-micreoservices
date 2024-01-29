package ru.inie.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaController {
    @GetMapping
    public String greetings() {
        return "Hello!";
    }
}
