package com.Circle.BookingTicket.Repository;

import com.Circle.BookingTicket.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
