package com.backendlld3.janfeb24bookmyshow.services;

import com.backendlld3.janfeb24bookmyshow.models.*;
import com.backendlld3.janfeb24bookmyshow.repositories.BookingRepository;
import com.backendlld3.janfeb24bookmyshow.repositories.ShowRepository;
import com.backendlld3.janfeb24bookmyshow.repositories.ShowSeatRepository;
import com.backendlld3.janfeb24bookmyshow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    private UserRepository userRepository;
    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;
    private BookingRepository bookingRepository;

    @Autowired
    BookingService(
            UserRepository userRepository,
            ShowRepository showRepository,
            ShowSeatRepository showSeatRepository,
            BookingRepository bookingRepository
    ){
        this.userRepository = userRepository;
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
        this.bookingRepository = bookingRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookTicket(
            int showId,
            int userId,
            List<Integer> showSeatIds
    ) {

//        1. Get user from the db
                Optional<User> userOptional = userRepository.findById(userId);
                if(userOptional.isEmpty()){
                    throw new RuntimeException("User not found");
                }
                User user = userOptional.get();
//        2. Get show from the db
                Optional<Show> showOptional = showRepository.findById(showId);
                if(showOptional.isEmpty()){
                    throw new RuntimeException("Show not found");
                }
                Show show = showOptional.get();
//        3. Get showSeats
               List<ShowSeat> showSeats = showSeatRepository.findAllById(showSeatIds);
//        4. Check for the availability of the seats
               for(ShowSeat showSeat : showSeats){
//                  6. otherwise throw exception
                   if(showSeat.getSeatStatus() != SeatStatus.EMPTY){
                       throw new RuntimeException("Show seats are not available at the moment.");
                   }
               }

//        5. if all are available , mark the status to blocked
            for(ShowSeat showSeat : showSeats){
                showSeat.setSeatStatus(SeatStatus.BLOCKED);
                showSeat.setBlockedAt(new Date());
            }
//        5.1 Make sure db is updated with the status
            showSeatRepository.saveAll(showSeats);
//        7. Get the Booking object ready
//        8. Find total amount of the seats
//                Implement a different PriceCalculatorService
//        9. Create , save and return the booking object
        Booking booking = new Booking();
        booking.setUser(user);
        booking.setShow(show);
        booking.setBookingDate(new Date());
        booking.setAmount(2000);
        booking.setPaymentList(new ArrayList<>());
        booking.setShowSeatList(showSeats);

        return bookingRepository.save(booking);
    }
}

// Very basic signUpFlow
// email password => userId

// 10 : 25 pm

