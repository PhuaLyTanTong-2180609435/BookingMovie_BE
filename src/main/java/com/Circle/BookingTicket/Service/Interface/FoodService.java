package com.Circle.BookingTicket.Service.Interface;

import com.Circle.BookingTicket.Model.Food;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FoodService {
    Food create(Food food);
    Food update(Food food);
    void delete(int id);
    Food findById(int id);
    Page<Food> findAll(Pageable pageable);
}
