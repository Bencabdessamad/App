package com.example.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Personne, Long> {

    Optional<Personne> findByEmail(String email);

    Optional<Personne> findByEmailAndPassword(String email, String password);
}

