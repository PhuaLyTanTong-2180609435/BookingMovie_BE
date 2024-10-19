package com.Circle.BookingTicket.Service.Interface;

import com.Circle.BookingTicket.Model.Room;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RoomService {
    Room create(Room room);
    Room update(Room room);
    void delete(int id);
    Room findById(int id);
    Page<Room> findAll(Pageable pageable);
}
