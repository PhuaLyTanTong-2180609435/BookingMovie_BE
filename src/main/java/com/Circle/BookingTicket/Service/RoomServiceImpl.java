package com.Circle.BookingTicket.Service;

import com.Circle.BookingTicket.Model.Room;
import com.Circle.BookingTicket.Repository.RoomRepository;
import com.Circle.BookingTicket.Service.Interface.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public Room create(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room update(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public void delete(int id) {
        roomRepository.deleteById(id);
    }

    @Override
    public Room findById(int id) {
        return roomRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Room> findAll(Pageable pageable) {
        return roomRepository.findAll(pageable);
    }
}
