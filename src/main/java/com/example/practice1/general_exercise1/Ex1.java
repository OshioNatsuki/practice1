package com.example.practice1.general_exercise1;

public class Ex1 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        
        cart.addItem(new Item("Java入門", 500));
        cart.addItem(new Item("アルバム", 3000));
        cart.addItem(new Item("シングル", 500));
        cart.addItem(new Item("映画", 2000));
        cart.addItem(new Item("ドラマ", 3000));
        cart.addItem(new Item("Java中級", 1000));
        cart.getItemSize();
        cart.getTotalPrice();
        cart.getAveragePrice();
        
    }
}
