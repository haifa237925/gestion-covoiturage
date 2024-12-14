package com.gestion.covoiturage.gestioncovoiturage.services;

import com.gestion.covoiturage.gestioncovoiturage.entities.User;
import com.gestion.covoiturage.gestioncovoiturage.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Méthode pour récupérer tous les utilisateurs
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Méthode pour récupérer un utilisateur par son ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Méthode pour ajouter un nouvel utilisateur
    public User addUser(User user) {
        return userRepository.save(user);
    }

    // Méthode pour supprimer un utilisateur
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
