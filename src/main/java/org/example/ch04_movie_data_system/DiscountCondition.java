package org.example.ch04_movie_data_system;

import lombok.Getter;
import lombok.Setter;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Getter @Setter
public class DiscountCondition {
    // 할인조건의 타입을 가지고
    private DiscountConditionType type;
    //type이 순번 조건이라면 이 값을 가지고
    private int sequence;

    //type이 기간 조건이라면 이 값들을 가진다.
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;


}
