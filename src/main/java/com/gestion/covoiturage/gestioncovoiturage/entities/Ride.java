package com.gestion.covoiturage.gestioncovoiturage.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "rides")
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "conducteur_id", nullable = false)
    private User conducteur;

    @Column(nullable = false, length = 100)
    private String pointDepart;

    @Column(nullable = false, length = 100)
    private String destination;

    @Column(nullable = false)
    private LocalDateTime dateHeure;

    @Column(nullable = false)
    private int placesDisponibles;

    @Column(nullable = false)
    private double prixParPlace;

    @Column(length = 500)
    private String commentaire;

    @Column(length = 500)
    private String restrictions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getConducteur() {
        return conducteur;
    }

    public void setConducteur(User conducteur) {
        this.conducteur = conducteur;
    }

    public String getPointDepart() {
        return pointDepart;
    }

    public void setPointDepart(String pointDepart) {
        this.pointDepart = pointDepart;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(LocalDateTime dateHeure) {
        this.dateHeure = dateHeure;
    }

    public int getPlacesDisponibles() {
        return placesDisponibles;
    }

    public void setPlacesDisponibles(int placesDisponibles) {
        this.placesDisponibles = placesDisponibles;
    }

    public double getPrixParPlace() {
        return prixParPlace;
    }

    public void setPrixParPlace(double prixParPlace) {
        this.prixParPlace = prixParPlace;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }
}
