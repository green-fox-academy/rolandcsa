package com.greenfox.calorietable.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CalorieTable {
    private List<Food> foodList;

    public CalorieTable(List<Food> foodList) {
        this.foodList = foodList;
    }
}
