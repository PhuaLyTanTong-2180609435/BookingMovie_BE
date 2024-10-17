package com.Circle.BookingTicket.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "CategoriesMovie")
@NoArgsConstructor
public class CategoriesMovie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String name; // Tên của thể loại phim

    @ManyToMany(mappedBy = "categories")
    private List<Movie> movies; // Danh sách các bộ phim thuộc thể loại này
}
