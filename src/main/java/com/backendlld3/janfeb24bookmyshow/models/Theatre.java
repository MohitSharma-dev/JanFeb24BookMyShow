package com.backendlld3.janfeb24bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Theatre extends BaseModel{
    private String name;
    private String address;
//    Theatre 1 : M Screen
    @OneToMany
    private List<Screen> screens;
    @ManyToOne
    private Region region;

}

// HW1 : read what is hibernate and how it helps you
// HW2 : Explore why hibernate creates a separate table in the case of 1 : Many
// HW3 : Is it possible to avoid this ?
// HW 4 : try to populate some data in these tables

// Next class : We will exectue the functionality of Booking ticket