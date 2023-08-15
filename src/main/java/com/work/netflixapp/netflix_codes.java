package com.work.netflixapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class netflix_codes {
    
    @Id
    private int id;
    private String description;

}
