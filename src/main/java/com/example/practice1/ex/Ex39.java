package com.example.practice1.ex;

/**
 * 演習３９
 * フィボナッチ数列を表示させるプログラムを作成してください
 * 結果が1000を超えた時点で終了してください
 * 1 1 2 3 5 8....
 */
public class Ex39 {
    
    public static void main(String[] args) {
        
        int num1 = 0;
        int num2 = 1;

        for (int i = 1; num2 <= 1000; i++){
            
            System.out.print( num2 + " ");

            int newNum = num1 + num2;
            num1 = num2;
            num2 = newNum;
            }
        }
}

