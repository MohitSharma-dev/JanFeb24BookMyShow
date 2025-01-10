package com.backendlld3.janfeb24bookmyshow.services;

import com.backendlld3.janfeb24bookmyshow.models.User;
import com.backendlld3.janfeb24bookmyshow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User signUp(
            String firstName,
            String email,
            String password
    ) {
//        check if user already exists
        Optional<User> userOptional = userRepository.findByEmail(email);
        if(userOptional.isPresent()){
            throw new RuntimeException("User already exists.");
        }
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName("");
        user.setName("");
        user.setEmail(email);
        user.setPassword(password);
        return userRepository.save(user);
    }
}
