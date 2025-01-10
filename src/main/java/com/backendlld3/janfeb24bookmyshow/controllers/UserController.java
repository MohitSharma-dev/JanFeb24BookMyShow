package com.backendlld3.janfeb24bookmyshow.controllers;

import com.backendlld3.janfeb24bookmyshow.dtos.ResponseStatus;
import com.backendlld3.janfeb24bookmyshow.dtos.SignUpRequestDTO;
import com.backendlld3.janfeb24bookmyshow.dtos.SignUpResponseDTO;
import com.backendlld3.janfeb24bookmyshow.models.User;
import com.backendlld3.janfeb24bookmyshow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    public SignUpResponseDTO signUp(SignUpRequestDTO request){
        SignUpResponseDTO response = new SignUpResponseDTO();
        try {
           User user = userService.signUp(
                   request.getFirstName(),
                   request.getEmail(),
                   request.getPassword()
           );
           response.setUserId(user.getId());
           response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception ex){
            response.setResponseStatus(ResponseStatus.FAILURE);
            System.out.println(ex.getMessage());
        }
        return response;
    }
}
