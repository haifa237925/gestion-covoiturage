package com.gestion.covoiturage.gestioncovoiturage.repositories;

import com.gestion.covoiturage.gestioncovoiturage.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
