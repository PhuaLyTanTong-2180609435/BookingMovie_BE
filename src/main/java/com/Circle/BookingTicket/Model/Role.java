package com.Circle.BookingTicket.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "Role")
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String roleName; // Tên vai trò (USER, ADMIN)

    @ManyToMany(mappedBy = "roles")
    private List<User> users; // Danh sách người dùng có vai trò này
}
