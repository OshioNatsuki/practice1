package com.example.practice1.medals;

public class Medal {
    
    private String name;
    private int price;

    
    public Medal() {
    }
    public Medal(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    
}
