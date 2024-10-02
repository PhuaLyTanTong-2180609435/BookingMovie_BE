package com.Circle.BookingTicket.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String seatNumber;  // Số ghế (VD: A1, A2, B1...)

    @ManyToOne
    @JoinColumn(name = "showtime_id")
    private ShowTime showtime;  // Suất chiếu liên quan

    private boolean isBooked;    // Trạng thái ghế (đã đặt hay chưa)
}
