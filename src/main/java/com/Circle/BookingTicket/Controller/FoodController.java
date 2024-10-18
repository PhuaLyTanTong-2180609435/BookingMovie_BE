package com.Circle.BookingTicket.Controller;

import com.Circle.BookingTicket.Model.Food;
import com.Circle.BookingTicket.Service.Interface.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/foods")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @PostMapping
    public Food create(@RequestBody Food food) {
        return foodService.create(food);
    }

    @PutMapping
    public Food update(@RequestBody Food food) {
        return foodService.update(food);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        foodService.delete(id);
    }

    @GetMapping("/{id}")
    public Food findById(@PathVariable int id) {
        return foodService.findById(id);
    }

    @GetMapping
    public Page<Food> findAll(Pageable pageable) {
        return foodService.findAll(pageable);
    }
}
