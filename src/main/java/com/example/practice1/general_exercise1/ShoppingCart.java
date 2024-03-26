package com.example.practice1.general_exercise1;


import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    
    
    List<Item> item = new ArrayList<>();
    
    
    
    public ShoppingCart() {
    }

    public ShoppingCart(List<Item> itemList) {
        this.item = itemList;
    }

    public List<Item> getItemList() {
        return item;
    }
    
    public void addItem(Item item){
        // Add an item to the shopping cart
        this.item.add(item);
    }

    public int getItemSize(){
        System.out.println(item.size());
        return item.size();
    }

    public int getTotalPrice(){
        // Calculate the total price
        int totalPrice = 0;
        // Add code to calculate the total price here
        for (Item item : item){
            totalPrice += item.getPrice();
        }
        System.out.println(totalPrice);
        return totalPrice;
    }

    public int getAveragePrice(){
        // Calculate the average price
        int averagePrice = 0;
        // Add code to calculate the average price here
        for (Item item : item){
            averagePrice += item.getPrice();
        }
        averagePrice = averagePrice / item.size();
        System.out.println(averagePrice);
        return averagePrice;
    }

    public void setItemList(List<Item> itemList) {
        this.item = itemList;
    }

    
    

}
