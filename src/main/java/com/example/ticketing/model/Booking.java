package com.example.ticketing.model;

import lombok.Data;

@Data
public class Booking {
    private String performance; // 공연 이름
    private int quantity;       // 예매 수량
    private String date;        // 예매 날짜
}
