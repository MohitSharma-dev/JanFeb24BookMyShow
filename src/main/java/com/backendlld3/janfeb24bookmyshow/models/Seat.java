package com.backendlld3.janfeb24bookmyshow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat extends BaseModel{
    private String seatNumber;
    private int rowVal;
    private int columnVal;
    @ManyToOne
    private SeatType seatType;
}
