package com.Circle.BookingTicket.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "Movie")
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name; // Tên phim

    @Column(nullable = false)
    private String img; // Đường dẫn hình ảnh

    @Column(nullable = false)
    private String director; // Tác giả

    private String trailer; // Link trailer phim

    @Column(nullable = false)
    private LocalDate premiere; // Ngày công chiếu

    @Column(nullable = false)
    private String actors; // Diễn viên

    @Column(nullable = false)
    private String language; // Ngôn ngữ phim

    @Column(nullable = false)
    private String duration; // Thời gian phim

    @ManyToMany
    @JoinTable(
            name = "Movie_Categories",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<CategoriesMovie> categories; // Danh sách các thể loại của phim
}
