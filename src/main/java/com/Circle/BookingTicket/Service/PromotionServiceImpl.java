package com.Circle.BookingTicket.Service;

import com.Circle.BookingTicket.Model.Promotion;
import com.Circle.BookingTicket.Repository.PromotionRepository;
import com.Circle.BookingTicket.Service.Interface.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PromotionServiceImpl implements PromotionService {

    @Autowired
    private PromotionRepository promotionRepository;

    @Override
    public Promotion create(Promotion promotion) {
        return promotionRepository.save(promotion);
    }

    @Override
    public Promotion update(Promotion promotion) {
        return promotionRepository.save(promotion);
    }

    @Override
    public void delete(int id) {
        promotionRepository.deleteById(id);
    }

    @Override
    public Promotion findById(int id) {
        return promotionRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Promotion> findAll(Pageable pageable) {
        return promotionRepository.findAll(pageable);
    }
}
