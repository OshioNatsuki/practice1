package com.example.practice1.ex;

/**
 * 演習３６
 * １〜１００までの値を出力して下さい
 * なお、下記の条件にて
 * ・出力するする値が３の倍数の時は「fizz」と出力
 * ・出力するする値が５の場合の時は「buzz」と出力
 * ・出力するする値が３と５の倍数が成り立つ時は「FizzBuzz」と出力
 */

public class ex36 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            
            if(i % (3 * 5) == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else{ 
                System.out.println(i);
            }
        }
    }
}
