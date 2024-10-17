package com.Circle.BookingTicket.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "Branch")
@NoArgsConstructor
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name; // Tên chi nhánh

    @Column(nullable = false)
    private String address; // Địa chỉ chi nhánh

    @OneToMany(mappedBy = "branch")
    private List<Cinema> cinemas; // Danh sách các rạp thuộc chi nhánh này
}
