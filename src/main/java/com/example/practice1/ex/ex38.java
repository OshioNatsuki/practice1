package com.example.practice1.ex;

/**
 * 演習３８
 * **********
 * *********
 * ********
 * *******
 * ******
 * *****
 * ****
 * ***
 * **
 * *
 * 上記の表示をさせてください
 */
public class ex38 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
            if(j >= i){
                System.out.print("*");
            }
        }
        System.out.println();
        }
    }
}
