package com.backendlld3.janfeb24bookmyshow.repositories;

import com.backendlld3.janfeb24bookmyshow.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
