package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personnes")
public class PersonneController {

    @Autowired
    private PersonneService personneService;

    @GetMapping
    public List<Personne> getAllPersonnes() {
        return personneService.getAllPersonnes();
    }

    @PostMapping("/add")
    public Personne addPersonne(@RequestBody Personne personne) {
        return personneService.addPersonne(personne);
    }
    @PostMapping("/register")
    public String registerPersonne(@RequestBody Personne personne) {
        try {
            personneService.registerPersonne(personne);
            return "Personne enregistrée avec succès!";
        } catch (EmailAlreadyExistsException e) {
            return "Erreur: Email déjà utilisé!";
        }
    }

    @PostMapping("/login")
    @CrossOrigin(origins = "http://localhost:8081")
    public String loginPersonne(@RequestBody Personne personne) {
        if (personneService.loginPersonne(personne.getEmail(), personne.getPassword())) {
            return "Connexion réussie!";
        } else {
            return "Erreur: Email ou mot de passe incorrect!";
        }
    }
}
