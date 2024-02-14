package com.example.practice1.repractices;

/**
 * 演習３３
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 上記を２重ループで表示させてください
 */
public class ex33 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(i >= j){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
