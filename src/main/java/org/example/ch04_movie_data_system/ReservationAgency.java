package org.example.ch04_movie_data_system;

public class ReservationAgency {
    public Reservation reserve(Screeing screeing, Customer customer, int audienceCount) {
        Movie movie = screeing.getMovie();

        // 1. 할인 가능 여부를 확인하는 부분
        boolean discountable = false;
        for(DiscountCondition condition : movie.getDiscountConditions()) {
            // 할인조건이 기간 조건이라면
            if(condition.getType() == DiscountConditionType.PERIOD) {
                discountable = screeing.getWhenScreend().getDayOfWeek().equals(condition.getDayOfWeek())
                        && condition.getStartTime().compareTo(screeing.getWhenScreend().toLocalTime()) <= 0
                        && condition.getEndTime().compareTo(screeing.getWhenScreend().toLocalTime()) >= 0;
            } else {// 할인조건이 순번 조건이라면
                discountable = condition.getSequence() == screeing.getSequence();
            }
            if(discountable) break;
        }

        // 2. 예매 요금 계산하는 부분
        Money fee;
        if(discountable) {  //할인한다면
            Money discountAmount = Money.ZERO;
            switch (movie.getMovieType()) {
                case AMOUNT_DISCOUNT:
                    discountAmount = movie.getDiscountAmount(); break;
                case PERCENT_DISCOUNT:
                    discountAmount = movie.getFee().times(movie.getDiscountPercent()); break;
                case NONE_DISCOUNT:
                    discountAmount = Money.ZERO; break;
            }
            fee = movie.getFee().minus(discountAmount);
        } else { // 할인하지 않으면
            fee = movie.getFee();
        }
        return new Reservation(customer, screeing, fee, audienceCount);
    }
}
