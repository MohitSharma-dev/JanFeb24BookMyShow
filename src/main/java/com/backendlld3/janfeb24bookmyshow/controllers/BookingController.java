package com.backendlld3.janfeb24bookmyshow.controllers;

import com.backendlld3.janfeb24bookmyshow.dtos.BookTicketRequestDTO;
import com.backendlld3.janfeb24bookmyshow.dtos.BookTicketResponseDTO;
import com.backendlld3.janfeb24bookmyshow.dtos.ResponseStatus;
import com.backendlld3.janfeb24bookmyshow.models.Booking;
import com.backendlld3.janfeb24bookmyshow.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;

    @Autowired
    BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookTicketResponseDTO bookTicket(BookTicketRequestDTO request){
        BookTicketResponseDTO response = new BookTicketResponseDTO();
        try{
            Booking booking = bookingService.bookTicket(
                    request.getShowId(),
                    request.getUserId(),
                    request.getShowSeatIds()
            );
            response.setBookingId(booking.getId());
            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setAmount(booking.getAmount());
        } catch (Exception ex){
            response.setResponseStatus(ResponseStatus.FAILURE);
        }
        return response;
    }
}
// @Component , @Controller, @Service , @Repository
// hardcoded

