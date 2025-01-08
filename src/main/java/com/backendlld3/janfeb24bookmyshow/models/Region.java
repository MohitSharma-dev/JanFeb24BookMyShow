package com.backendlld3.janfeb24bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Region extends BaseModel{
    private String name;
//    private List<Theatre> theatreList;
}
