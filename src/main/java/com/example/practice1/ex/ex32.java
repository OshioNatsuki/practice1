package com.example.practice1.ex;

/**
 * 演習３２
 * 2重ループを使用して
 * 12345
 * 12345
 * 12345
 * 12345
 * 12345
 * 上記を表示してください
 */
public class ex32 {
    
    public static void main(String[] args) {
        
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
