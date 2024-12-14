package com.gestion.covoiturage.gestioncovoiturage.repositories;

import com.gestion.covoiturage.gestioncovoiturage.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride, Long> {

}
