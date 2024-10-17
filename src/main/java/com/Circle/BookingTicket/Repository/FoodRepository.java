package com.Circle.BookingTicket.Repository;

import com.Circle.BookingTicket.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Integer> {
}
