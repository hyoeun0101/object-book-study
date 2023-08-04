package org.example.ch04_movie_data_system;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class Screeing {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreend;
}
