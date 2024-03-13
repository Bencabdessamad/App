package com.example.app.cours;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Integer> {
    // Pas besoin de méthodes personnalisées pour créer et récupérer tous les cours, JpaRepository le fournit automatiquement.
}
