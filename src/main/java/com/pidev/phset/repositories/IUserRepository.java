package com.pidev.phset.repositories;

import com.pidev.phset.entities.Account;
import com.pidev.phset.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface IUserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByFirstName(String username);

    Boolean existsByFirstName(String username);

    Boolean existsByEmail(String email);

}
