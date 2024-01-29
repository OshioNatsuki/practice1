package com.example.practice1.repractices;

public class Ex49 {
    
    public static void main(String[] args) {
        
        System.out.println((int)calc(2000));
        System.out.println((int)calclncludTax(2000));
        System.out.println((int)calcHalfPrice(2000));
        System.out.println((int)calcTimeSericeprice(2000, 0.8));
        
    }

    //消費税率を計算して返す（１０％）
    static double calc(int price){
        double tax = price * 0.1;
        return tax;
    }

    //消費税込金額を計算して返す（１０％）
    static double calclncludTax(int price){
        double intaxprice = price + (price * 0.1);
        return intaxprice;
    }

    //半額を計算して返す（小数点以下は切り捨て）
    static double calcHalfPrice(int price){
        double haflPrice =  price  / 2.0;
        return haflPrice;
    }

    //第２引数で与えられた割引率で計算してその結果を返す
    //（小数点以下はキリすて）
    //割引率→０．８したら２割引になる
    static double calcTimeSericeprice(int price, double discountRate){
        double discountPrice = price * discountRate;
        return discountPrice;
    }




}
