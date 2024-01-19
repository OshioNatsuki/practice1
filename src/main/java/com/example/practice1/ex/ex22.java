package com.example.practice1.ex;

/**
 * ・整数型の変数conditionを宣言し、５という値を代入してください
 * ・conditionを２で割った余りが１であれば”奇数”、そうでなければ”偶数”と表示してください
 */
public class ex22 {
    public static void main(String[] args) {
        int condition = 5;

        if( condition % 2 == 0){
            System.out.println("偶数です");
        }else{
            System.out.println("奇数です");
        }
    }
}
