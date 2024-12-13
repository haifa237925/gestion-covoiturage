package com.gestion.covoiturage.gestioncovoiturage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Bienvenue dans l'application de gestion de covoiturage !";
    }
}
