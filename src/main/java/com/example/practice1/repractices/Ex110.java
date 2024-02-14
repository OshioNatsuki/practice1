package com.example.practice1.repractices;

/**
 * 配列
 * ５．６．１．３．９　の値
 */
//繰り返しを使って配列の値の５番目から１番目の順に全て表示してください

public class Ex110 {
    public static void main(String[] args) {

        int[] numbers = { 5, 6, 1, 3, 9 };

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
