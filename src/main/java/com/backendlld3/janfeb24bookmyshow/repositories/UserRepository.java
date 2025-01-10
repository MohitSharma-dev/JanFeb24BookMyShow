package com.backendlld3.janfeb24bookmyshow.repositories;

import com.backendlld3.janfeb24bookmyshow.models.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.function.Function;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}

// Data JPA
// Hibernate

// JPA is like the interface
// Hibernate : ORM => Object-relation mapping
// Implements all the things