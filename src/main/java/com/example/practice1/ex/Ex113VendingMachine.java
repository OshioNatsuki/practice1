package com.example.practice1.ex;

public class Ex113VendingMachine {
    static final int PRICE = 120;
    int money;
    int stock;
    
    public Ex113VendingMachine() {

    }
    
    public Ex113VendingMachine(int money, int stock) {
        this.money = money;
        this.stock = stock;
    }

    void refillStock(int newStock){
        if(stock >= 10){
            System.out.println("商品がいっぱいです");
        }else{
            stock = stock + newStock;
            System.out.println("在庫が" + stock + "個になりました");
        }
    }

    void putMoney(int newMoney){
        money = money + newMoney;
        System.out.println("入金額が" + money + "になりました");
    }

    void buyItem(){
        if(stock <= 0){
            System.out.println("在庫を追加してください");
        }else if(money <= 0){
            System.out.println("お金を入れてください");
        }else if(money < PRICE){
            System.out.println("お金が足りません (現在の残高" + money + "円)");
        }else{
            System.out.println("商品を購入しました");
            stock = stock - 1;
            money = money - PRICE;
            if(stock <= 0){
                System.out.println("在庫切れになりました");
            }
        }
    }
    
}
