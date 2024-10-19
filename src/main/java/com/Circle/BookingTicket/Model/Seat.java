package com.Circle.BookingTicket.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Seat")
@NoArgsConstructor
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String seatNumber; // Số ghế

    @Column(nullable = false)
    private double price; // Giá vé cho ghế này

    @Column(nullable = false)
    private boolean isBooked; // Trạng thái của ghế (đã được đặt hay chưa)

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room; // Phòng chiếu mà ghế này thuộc về

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private CategoriesSeat categoriesSeat; // Loại ghế (VIP, Normal)
}
