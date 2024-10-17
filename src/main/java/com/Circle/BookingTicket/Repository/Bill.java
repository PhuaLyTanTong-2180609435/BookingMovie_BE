package com.Circle.BookingTicket.Repository;

import com.Circle.BookingTicket.Model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bill extends JpaRepository<Seat,Integer> {
}
