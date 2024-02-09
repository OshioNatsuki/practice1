package com.example.practice1.ex;

public class Ex113 {
    public static void main(String[] args) {
        Ex113VendingMachine vendingMachine = new Ex113VendingMachine(0, 0);

        vendingMachine.buyItem();
        vendingMachine.refillStock(3);
        vendingMachine.buyItem();
        vendingMachine.putMoney(500);
        for(int i = 0; i < 3; i++){
            vendingMachine.buyItem();
        }
        vendingMachine.refillStock(3);
        for(int i = 0; i < 3; i++){
            vendingMachine.buyItem();
        }
    }
}

