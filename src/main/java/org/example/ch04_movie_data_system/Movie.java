package org.example.ch04_movie_data_system;

import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.util.List;

@Getter @Setter
public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;

    /**
     * 할인 조건 목록을 직접 가지고 있다.
     */
    private List<DiscountCondition> discountConditions;

    /**
     * 할인 정책의 종류
     */
    private MovieType movieType;

    /**
     * 할인금액을 직접 가지고 있다.
     */
    private Money discountAmount;
    /**
     * 할인 비율을 직접 가지고 있다.
     */
    private double discountPercent;
}
