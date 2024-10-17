package com.Circle.BookingTicket.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "User")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String username; // Tên đăng nhập

    @Column(nullable = false)
    private String password; // Mật khẩu

    @Column(nullable = false, unique = true)
    private String email; // Email

    @Column(nullable = false)
    private String fullName; // Họ và tên

    @ManyToMany
    @JoinTable(
            name = "User_Role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles; // Danh sách vai trò của người dùng

    @OneToMany(mappedBy = "user")
    private List<Ticket> tickets; // Danh sách vé mà người dùng đã đặt
}
