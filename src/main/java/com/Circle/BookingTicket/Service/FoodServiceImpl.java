package com.Circle.BookingTicket.Service;

import com.Circle.BookingTicket.Model.Food;
import com.Circle.BookingTicket.Repository.FoodRepository;
import com.Circle.BookingTicket.Service.Interface.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public Food create(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public Food update(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public void delete(int id) {
        foodRepository.deleteById(id);
    }

    @Override
    public Food findById(int id) {
        return foodRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Food> findAll(Pageable pageable) {
        return foodRepository.findAll(pageable);
    }
}
