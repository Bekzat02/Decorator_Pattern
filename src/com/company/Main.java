package com.company;

import com.company.domains.VegFood;

public class Main {

    public static void main(String[] args) {
        VegFood vf=new VegFood();
        System.out.println(vf.prepareFood());
        System.out.println(vf.foodPrice());
    }
}
