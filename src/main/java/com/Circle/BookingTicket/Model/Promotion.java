package com.Circle.BookingTicket.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "Promotion")
@NoArgsConstructor
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String code; // Mã khuyến mãi

    @Column(nullable = false)
    private double discount; // Giảm giá

    @Column(nullable = false)
    private LocalDate startDate; // Ngày bắt đầu

    @Column(nullable = false)
    private LocalDate endDate; // Ngày kết thúc
}
