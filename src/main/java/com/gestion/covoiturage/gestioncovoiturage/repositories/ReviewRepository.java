package com.gestion.covoiturage.gestioncovoiturage.repositories;

import com.gestion.covoiturage.gestioncovoiturage.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
