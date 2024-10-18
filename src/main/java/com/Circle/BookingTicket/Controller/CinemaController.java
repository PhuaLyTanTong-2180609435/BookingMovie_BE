package com.Circle.BookingTicket.Controller;

import com.Circle.BookingTicket.Model.Cinema;
import com.Circle.BookingTicket.Service.Interface.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cinemas")
public class CinemaController {

    @Autowired
    private CinemaService cinemaService;

    @PostMapping
    public Cinema create(@RequestBody Cinema cinema) {
        return cinemaService.create(cinema);
    }

    @PutMapping
    public Cinema update(@RequestBody Cinema cinema) {
        return cinemaService.update(cinema);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        cinemaService.delete(id);
    }

    @GetMapping("/{id}")
    public Cinema findById(@PathVariable int id) {
        return cinemaService.findById(id);
    }

    @GetMapping
    public Page<Cinema> findAll(Pageable pageable) {
        return cinemaService.findAll(pageable);
    }
}
