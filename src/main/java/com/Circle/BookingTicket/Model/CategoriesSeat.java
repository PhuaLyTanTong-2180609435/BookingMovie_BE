package com.Circle.BookingTicket.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "CategoriesSeat")
@NoArgsConstructor
public class CategoriesSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String name; // Tên phân loại ghế

    @OneToMany(mappedBy = "categoriesSeat")
    private List<Seat> seats; // Danh sách các ghế thuộc loại này
}
