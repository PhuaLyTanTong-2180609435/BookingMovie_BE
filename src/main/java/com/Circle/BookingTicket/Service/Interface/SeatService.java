package com.Circle.BookingTicket.Service.Interface;
import com.Circle.BookingTicket.Model.Seat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SeatService {
    Seat create(Seat seat);
    Seat update(Seat seat);
    void delete(int id);
    Seat findById(int id);
    Page<Seat> findAll(Pageable pageable);
}