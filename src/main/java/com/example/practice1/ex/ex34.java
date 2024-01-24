package com.example.practice1.ex;

/**
 * 演習３４
 * 12345
 * 1234
 * 123
 * 12
 * 1
 * 2重ループにて
 * 上記の表示をしてください
 */
public class ex34 {
    public static void main(String[] args) {   

        for (int i = 5; i >= 0; i--) {
            for (int j = 1; j <= 5; j++) {
                if (j <= i){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}