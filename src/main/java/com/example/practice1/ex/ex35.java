package com.example.practice1.ex;

/**
 * 演習３５
 * 掛け算の九九表を表示させてください
 * 答えにはスペースを入れて見やすくしてください
 */
public class ex35 {
    
    public static void main(String[] args) {
        
        int num = 0;
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= 9 ; j++) {
                num = i * j;
                
                if (num < 10){
                    System.out.print(" " + num + "  ");
                }else{
                    System.out.print(" " + num + " " );
                }
            }
            System.out.println();
        }
    }
}
