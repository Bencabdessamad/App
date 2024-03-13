package com.example.app.cours;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "cours")
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom_cour;
    private String nom_persone;
    private String prenom_persone;
    private LocalDate dateDepart;
    private boolean enLigne;

    private String phone;

    public Cours() {
    }

    public Cours(int id, String nom_cour, String nom_persone, String prenom_persone, LocalDate dateDepart, boolean enLigne,String phone) {
        this.id = id;
        this.nom_cour = nom_cour;
        this.nom_persone = nom_persone;
        this.prenom_persone = prenom_persone;
        this.dateDepart = dateDepart;
        this.enLigne = enLigne;
        this.phone=phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_cour() {
        return nom_cour;
    }

    public void setNom_cour(String nom_cour) {
        this.nom_cour = nom_cour;
    }

    public String getNom_persone() {
        return nom_persone;
    }

    public void setNom_persone(String nom_persone) {
        this.nom_persone = nom_persone;
    }

    public String getPrenom_persone() {
        return prenom_persone;
    }

    public void setPrenom_persone(String prenom_persone) {
        this.prenom_persone = prenom_persone;
    }

    public LocalDate getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(LocalDate dateDepart) {
        this.dateDepart = dateDepart;
    }

    public boolean isEnLigne() {
        return enLigne;
    }

    public void setEnLigne(boolean enLigne) {
        this.enLigne = enLigne;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
