package com.example.practice1.ex;

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

        int x = 4;

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int i = x - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
