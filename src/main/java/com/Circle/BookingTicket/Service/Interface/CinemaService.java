package com.Circle.BookingTicket.Service.Interface;

import com.Circle.BookingTicket.Model.Cinema;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CinemaService {
    Cinema create(Cinema cinema);
    Cinema update(Cinema cinema);
    void delete(int id);
    Cinema findById(int id);
    Page<Cinema> findAll(Pageable pageable);
}
