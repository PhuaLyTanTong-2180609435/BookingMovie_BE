package com.Circle.BookingTicket.Service.Interface;

import com.Circle.BookingTicket.Model.Promotion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PromotionService {
    Promotion create(Promotion promotion);
    Promotion update(Promotion promotion);
    void delete(int id);
    Promotion findById(int id);
    Page<Promotion> findAll(Pageable pageable);
}
