package com.Circle.BookingTicket.Controller;

import com.Circle.BookingTicket.Model.Promotion;
import com.Circle.BookingTicket.Service.Interface.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/promotions")
public class PromotionController {

    @Autowired
    private PromotionService promotionService;

    @PostMapping
    public Promotion create(@RequestBody Promotion promotion) {
        return promotionService.create(promotion);
    }

    @PutMapping
    public Promotion update(@RequestBody Promotion promotion) {
        return promotionService.update(promotion);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        promotionService.delete(id);
    }

    @GetMapping("/{id}")
    public Promotion findById(@PathVariable int id) {
        return promotionService.findById(id);
    }

    @GetMapping
    public Page<Promotion> findAll(Pageable pageable) {
        return promotionService.findAll(pageable);
    }
}
