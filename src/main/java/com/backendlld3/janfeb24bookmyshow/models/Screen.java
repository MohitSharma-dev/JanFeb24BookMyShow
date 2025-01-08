package com.backendlld3.janfeb24bookmyshow.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Screen extends BaseModel {
    private String name;
//    Screen 1 : M Seat
    @OneToMany
    private List<Seat> seats;
    @Enumerated(value = EnumType.ORDINAL)
    @ElementCollection
    private List<Features> features;
}

// SCreen
// id name
