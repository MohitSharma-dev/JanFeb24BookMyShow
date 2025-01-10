package com.backendlld3.janfeb24bookmyshow.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookTicketRequestDTO {
    private int showId;
    private List<Integer> showSeatIds;
    private int userId;
}
