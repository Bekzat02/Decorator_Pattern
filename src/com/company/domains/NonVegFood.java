package com.company.domains;

import com.company.FoodDecorator;
import com.company.interfaces.Food;

public class NonVegFood extends FoodDecorator {
    public NonVegFood(Food newFood) {
        super(newFood);
    }
    public String prepareFood(){
        return super.prepareFood()+" KFC";
    }
    public double foodPrice(){
        return super.foodPrice()+150.0;
    }
}
