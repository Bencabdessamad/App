package com.example.app.cours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursServices {

    @Autowired
    private CoursRepository coursRepository;

    public Cours createCours(Cours cours) {
        return coursRepository.save(cours);
    }

    public List<Cours> getAllCours() {
        return coursRepository.findAll();
    }
}
