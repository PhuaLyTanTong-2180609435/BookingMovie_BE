package com.Circle.BookingTicket.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;        // Tiêu đề phim
    private String description;  // Mô tả phim
    private String genre;        // Thể loại
    private String director;     // Đạo diễn
    private int duration;        // Thời gian chiếu (phút)

    @OneToMany(mappedBy = "movie")
    private List<ShowTime> showtimes; // Quan hệ với suất chiếu
}
