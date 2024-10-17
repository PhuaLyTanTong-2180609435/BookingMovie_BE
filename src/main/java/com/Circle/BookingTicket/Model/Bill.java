package com.Circle.BookingTicket.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "Bill")
@NoArgsConstructor
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private double totalPrice; // Tổng giá trị hóa đơn

    @Column(nullable = false)
    private LocalDateTime createdDate; // Ngày tạo hóa đơn

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // Người dùng liên quan đến hóa đơn
}
