package com.example.practice1.ex;

/**
 * 配列応用問題
 */
public class Ex117 {
    public static void main(String[] args) {

        // １０個の整数の入力を表示出力から受け取り配列に格納した後に、
        // 入力されたあたいを２倍にして出力してください
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            
        for (var number : numbers) {
            int twice = number * 2;
            System.out.print(twice + " ");
        }
        System.out.println();
        
        //上記の処理に続けて配列に入力された数値と偶数と奇数に分けて表示して下さい
        
    }
}
