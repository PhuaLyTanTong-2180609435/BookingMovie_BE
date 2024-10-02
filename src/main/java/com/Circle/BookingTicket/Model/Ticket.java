package com.Circle.BookingTicket.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "showtime_id")
    private ShowTime showtime;  // Suất chiếu liên quan

    @ManyToOne
    @JoinColumn(name = "seat_id")
    private Seat seat;          // Ghế liên quan

    private String userEmail;   // Thông tin người đặt vé
}