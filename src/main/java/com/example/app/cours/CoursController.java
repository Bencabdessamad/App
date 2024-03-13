package com.example.app.cours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cours")
public class CoursController {

    @Autowired
    private CoursServices coursService;

    @PostMapping("/create")
    public ResponseEntity<Cours> createCours(@RequestBody Cours cours) {
        Cours createdCours = coursService.createCours(cours);
        return new ResponseEntity<>(createdCours, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Cours>> getAllCours() {
        List<Cours> allCours = coursService.getAllCours();
        return new ResponseEntity<>(allCours, HttpStatus.OK);
    }
}
