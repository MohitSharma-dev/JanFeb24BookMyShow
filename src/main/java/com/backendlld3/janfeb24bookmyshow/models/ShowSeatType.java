package com.backendlld3.janfeb24bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeatType extends BaseModel{
    @ManyToOne
    private Show show;
    @ManyToOne
    private SeatType seatType;
    private double price;
}
