package com.example.ticketing.Controller;

import com.example.ticketing.model.Booking;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @PostMapping
    public String bookTickets(@RequestBody Booking booking) {
        // 예매 처리 로직 (예: 데이터베이스에 저장)
        // 현재는 간단히 확인 메시지를 반환
        return String.format("예매 완료! 공연: %s, 수량: %d, 날짜: %s",
                booking.getPerformance(),
                booking.getQuantity(),
                booking.getDate());
    }
}
