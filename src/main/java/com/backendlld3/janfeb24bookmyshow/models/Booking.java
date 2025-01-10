package com.backendlld3.janfeb24bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Booking extends BaseModel{
    private Date bookingDate;
    @ManyToOne
    private User user;
    @ManyToOne
    private Show show;
    @OneToMany
    private List<ShowSeat> showSeatList;
    @OneToMany
    private List<Payment> paymentList;
    private int amount;
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus status;

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public List<ShowSeat> getShowSeatList() {
        return showSeatList;
    }

    public void setShowSeatList(List<ShowSeat> showSeatList) {
        this.showSeatList = showSeatList;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }
}
// Booking  M : 1  User


// HW
// complete the models
// complete all the cardinalities
// Enums : Enumerated
//     @Enumerated(EnumType.ORDINAL)
// Run the application : errors
//