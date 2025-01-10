package com.backendlld3.janfeb24bookmyshow;

import com.backendlld3.janfeb24bookmyshow.controllers.UserController;
import com.backendlld3.janfeb24bookmyshow.dtos.SignUpRequestDTO;
import com.backendlld3.janfeb24bookmyshow.dtos.SignUpResponseDTO;
import com.backendlld3.janfeb24bookmyshow.models.BaseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JanFeb24BookMyShowApplication implements CommandLineRunner {
    @Autowired
    private UserController userController;

    @Override
    public void run(String... args) throws Exception {
        SignUpRequestDTO requestDTO = new SignUpRequestDTO();
        requestDTO.setFirstName("John");
        requestDTO.setEmail("john@gmail.com");
        requestDTO.setPassword("password");

        SignUpResponseDTO responseDTO = userController.signUp(requestDTO);
        System.out.println(responseDTO.getResponseStatus());
    }

    public static void main(String[] args) {
        SpringApplication.run(JanFeb24BookMyShowApplication.class, args);
    }

}
// Agenda
// Completing one functionality of Booking the ticket
// Basic Sign up flow which will be working

// HW : Complete the book my show functionality by adding data to the db

// created the models
// created the tables in the db

// Controller(ReqDto) : Response -> Service -> repository
