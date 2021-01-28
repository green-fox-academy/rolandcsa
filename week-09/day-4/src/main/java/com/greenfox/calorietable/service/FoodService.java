package com.greenfox.calorietable.service;

import com.greenfox.calorietable.model.Food;
import com.greenfox.calorietable.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    private final FoodRepository foodRepository;

    @Autowired
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> findAll() {
        return (List<Food>) foodRepository.findAll();
    }

    public void createNewFood(Food food) {
        foodRepository.save(food);
    }
}
