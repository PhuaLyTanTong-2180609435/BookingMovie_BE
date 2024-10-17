package com.Circle.BookingTicket.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "ShowTime")
@NoArgsConstructor
public class ShowTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private LocalDateTime showDateTime; // Thời gian chiếu phim

    @Column(nullable = false)
    private double price; // Giá vé cho suất chiếu này

    @ManyToOne
    @JoinColumn(name = "cinema_id", nullable = false)
    private Cinema cinema; // Rạp chiếu phim của suất chiếu

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie; // Phim sẽ được chiếu
}
