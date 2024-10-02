package com.Circle.BookingTicket.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class ShowTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startTime;  // Thời gian bắt đầu suất chiếu

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;  // Phim liên quan

    @OneToMany(mappedBy = "showtime")
    private List<Seat> seats; // Quan hệ với ghế ngồi
}
