package com.example.practice1.ex;

/**
 * 500円の商品を４つ、350円の商品を８つ購入したときの小計金額と
 * 消費税と合計金額をそれぞれ出力してください
 */
public class ex12 {
    public static void main(String[] args) {
        int item1 = 500 * 4;
        int item2 = 350 * 8;
        
        int subtotal = item1 + item2 ;
        System.out.println("小計金額\n" + subtotal);

        double tax = (int)(item1 + item2) * 0.1;
        System.out.println("消費税\n" + tax);

        double total = subtotal + tax;
        System.err.println("合計金額\n" + total);
    }
}
