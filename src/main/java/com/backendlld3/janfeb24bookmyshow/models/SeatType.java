package com.backendlld3.janfeb24bookmyshow.models;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SeatType extends BaseModel{
    private String name;
}
