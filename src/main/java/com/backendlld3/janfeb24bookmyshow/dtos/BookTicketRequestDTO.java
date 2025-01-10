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

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public List<Integer> getShowSeatIds() {
        return showSeatIds;
    }

    public void setShowSeatIds(List<Integer> showSeatIds) {
        this.showSeatIds = showSeatIds;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
