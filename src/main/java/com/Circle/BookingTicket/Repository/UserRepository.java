package com.Circle.BookingTicket.Repository;

import com.Circle.BookingTicket.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
