package com.greenfox.calorietable.service;

import com.greenfox.calorietable.model.Food;
import com.greenfox.calorietable.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void deleteFood(Long id) {
        foodRepository.deleteById(id);
    }

    public void updateFood(Long id, Food updatedFood) {
        Optional<Food> optionalFood = foodRepository.findById(id);
        if (optionalFood.isEmpty()) {
            throw new IllegalArgumentException();
        }
        Food food = optionalFood.get();
        food.setName(updatedFood.getName());
        food.setAmount(updatedFood.getAmount());
        food.setCalorie(updatedFood.getCalorie());

        foodRepository.save(food);
    }
}
