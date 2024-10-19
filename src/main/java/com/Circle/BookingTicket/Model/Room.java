package com.Circle.BookingTicket.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "Room")
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int capacity;

    @ManyToOne
    @JoinColumn(name = "cinema_id", nullable = false)
    private Cinema cinema; // Rạp chiếu mà phòng này thuộc về

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Seat> seats; // Danh sách các ghế trong phòng chiếu
}
