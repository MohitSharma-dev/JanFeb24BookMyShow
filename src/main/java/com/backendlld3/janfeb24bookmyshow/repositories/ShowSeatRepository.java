package com.backendlld3.janfeb24bookmyshow.repositories;

import com.backendlld3.janfeb24bookmyshow.models.SeatStatus;
import com.backendlld3.janfeb24bookmyshow.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Integer> {

    List<ShowSeat> findAllByIdAndSeatStatusLike(Iterable<Integer> integers, SeatStatus seatStatus);
}
