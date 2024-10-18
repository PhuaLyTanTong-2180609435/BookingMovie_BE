package com.Circle.BookingTicket.Service;

import com.Circle.BookingTicket.Model.Cinema;
import com.Circle.BookingTicket.Repository.CinemaRepository;
import com.Circle.BookingTicket.Service.Interface.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CinemaServiceImpl implements CinemaService {

    @Autowired
    private CinemaRepository cinemaRepository;

    @Override
    public Cinema create(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }

    @Override
    public Cinema update(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }

    @Override
    public void delete(int id) {
        cinemaRepository.deleteById(id);
    }

    @Override
    public Cinema findById(int id) {
        return cinemaRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Cinema> findAll(Pageable pageable) {
        return cinemaRepository.findAll(pageable);
    }
}
