package com.Circle.BookingTicket.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "Cinema")
@NoArgsConstructor
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String name; // Tên của rạp chiếu phim

    @Column(nullable = false)
    private int totalSeats; // Tổng số ghế trong rạp

    @ManyToOne
    @JoinColumn(name = "branch_id", nullable = false)
    private Branch branch; // Chi nhánh mà rạp này thuộc về

    @OneToMany(mappedBy = "cinema", cascade = CascadeType.ALL)
    private List<Room> rooms; // Danh sách các phòng chiếu trong rạp

    @OneToMany(mappedBy = "cinema")
    private List<ShowTime> showTimes; // Danh sách các suất chiếu tại rạp
}
