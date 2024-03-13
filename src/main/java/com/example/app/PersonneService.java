package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonneService {

    @Autowired
    private PersonRepository personneRepository;

    public List<Personne> getAllPersonnes() {
        return personneRepository.findAll();
    }
    public Personne addPersonne(Personne personne) {
        return personneRepository.save(personne);
    }
    public void registerPersonne(Personne personne) throws EmailAlreadyExistsException {
        Optional<Personne> existingPersonne = personneRepository.findByEmail(personne.getEmail());
        if (existingPersonne.isPresent()) {
            throw new EmailAlreadyExistsException();
        } else {
            personneRepository.save(personne);
        }
    }

    public boolean loginPersonne(String email, String password) {
        Optional<Personne> existingPersonne = personneRepository.findByEmailAndPassword(email, password);
        return existingPersonne.isPresent();
    }
}
