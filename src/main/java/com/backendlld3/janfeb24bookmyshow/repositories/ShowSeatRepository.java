package com.backendlld3.janfeb24bookmyshow.repositories;

import com.backendlld3.janfeb24bookmyshow.models.SeatStatus;
import com.backendlld3.janfeb24bookmyshow.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Integer> {
}
