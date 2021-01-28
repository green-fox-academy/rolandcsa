package com.greenfox.calorietable.controller;

import com.greenfox.calorietable.model.CalorieTable;
import com.greenfox.calorietable.model.Food;
import com.greenfox.calorietable.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    private final FoodService foodService;

    @Autowired
    public MainController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/drax")
    public ResponseEntity<CalorieTable> getFoodList() {
        return ResponseEntity.ok(new CalorieTable(foodService.findAll()));
    }

    @PostMapping("/drax")
    public ResponseEntity<CalorieTable> createNewFood(@RequestBody(required = false) Food food) {
        foodService.createNewFood(food);
        return new ResponseEntity<>(new CalorieTable(foodService.findAll()), HttpStatus.CREATED);
    }

    @DeleteMapping("/drax/{id}")
    public ResponseEntity<CalorieTable> deleteFood(@PathVariable Long id) {
        foodService.deleteFood(id);
        return ResponseEntity.ok(new CalorieTable(foodService.findAll()));
    }

    @PutMapping("/drax/{id}")
    public ResponseEntity<CalorieTable> updateFood(@PathVariable Long id, @RequestBody(required = false) Food food) {
        foodService.updateFood(id, food);
        return ResponseEntity.ok(new CalorieTable(foodService.findAll()));
    }
}
