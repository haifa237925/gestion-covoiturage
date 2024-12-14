package com.gestion.covoiturage.gestioncovoiturage.repositories;

import com.gestion.covoiturage.gestioncovoiturage.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
