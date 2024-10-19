package com.Circle.BookingTicket.Controller;

import com.Circle.BookingTicket.Model.Room;
import com.Circle.BookingTicket.Service.Interface.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping
    public Room create(@RequestBody Room room) {
        return roomService.create(room);
    }

    @PutMapping
    public Room update(@RequestBody Room room) {
        return roomService.update(room);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        roomService.delete(id);
    }

    @GetMapping("/{id}")
    public Room findById(@PathVariable int id) {
        return roomService.findById(id);
    }

    @GetMapping
    public Page<Room> findAll(Pageable pageable) {
        return roomService.findAll(pageable);
    }
}
