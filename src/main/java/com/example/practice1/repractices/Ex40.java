package com.example.practice1.repractices;

/**
 * 演習４０
 * *
 * **
 * ***
 * ****
 * ***
 * **
 * *
 * 上記を表示してください
 */
public class Ex40 {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i >= j) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i <= j) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}