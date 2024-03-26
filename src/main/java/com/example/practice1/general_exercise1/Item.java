package com.example.practice1.general_exercise1;

public class Item {
    
    private String name;
    private Integer price;

    
    public Item(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Item (){

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

    public void add(Item item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    
}
