package org.example.ch04_movie_data_system;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Reservation {
    private Customer customer;
    private Screeing screeing;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screeing screeing, Money fee, int audienceCount) {
        this.customer = customer;
        this.screeing = screeing;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
