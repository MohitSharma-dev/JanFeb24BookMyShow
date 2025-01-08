package com.backendlld3.janfeb24bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Payment extends BaseModel{
    private double amount;
    private Date paymentDate;
    @Enumerated(value = EnumType.ORDINAL)
    private PaymentMode mode;
    private String refNumber;
    @Enumerated(value = EnumType.ORDINAL)
    private PaymentGateway paymentGateway;
    @Enumerated(value = EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    @ManyToOne
    private Booking booking;
}
