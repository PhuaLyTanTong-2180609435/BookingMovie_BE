package com.Circle.BookingTicket.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "Ticket")
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private double price; // Giá vé

    @Column(nullable = false)
    private LocalDateTime bookingDate; // Ngày đặt vé

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // Người dùng đã đặt vé

    @ManyToOne
    @JoinColumn(name = "seat_id", nullable = false)
    private Seat seat; // Ghế được đặt

    @ManyToOne
    @JoinColumn(name = "showtime_id", nullable = false)
    private ShowTime showTime; // Suất chiếu của vé
}
