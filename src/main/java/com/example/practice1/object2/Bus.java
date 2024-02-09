package com.example.practice1.object2;


public class Bus extends Car {
    
    private int price;
    public String getName;

    @Override
    void stepOnAccele(){
        super.stepOnAccele();
        price = price + 90;
        System.out.println(getName +  "値段は" + price + "円です");

    }
}
