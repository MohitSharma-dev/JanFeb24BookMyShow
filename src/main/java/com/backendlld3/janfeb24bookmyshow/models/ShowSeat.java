package com.backendlld3.janfeb24bookmyshow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    @Enumerated(value = EnumType.ORDINAL)
    private SeatStatus seatStatus;
}

// ShowSeat M : 1 Show

// 5pm 1 available
// 5pm 2 booked
// 5pm 3 outofservice
// 10pm 1 booked