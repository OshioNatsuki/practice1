package com.example.practice1.repractices;

/** 
 * 演習３１
 * for文を使用して、１から１０までの総和を表示してください
 */
public class ex31 {
    public static void main(String[] args) {
        
        int num = 0;

        for(int i = 1; i <= 10; i++){
            num = num + i;
        }
        System.out.println(num);
    }
}

