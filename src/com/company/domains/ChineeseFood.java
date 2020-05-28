package com.company.domains;

import com.company.FoodDecorator;
import com.company.interfaces.Food;

public class ChineeseFood extends FoodDecorator {
    public ChineeseFood(Food newFood) {
        super(newFood);
    }

    public String prepareFood(){
        return super.prepareFood()+ "Kurt, kumyrsqa";
    }

    public double foodPrice(){
        return super.foodPrice()+65.6;
    }
}
