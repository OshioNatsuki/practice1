package com.example.practice1.ex;

/**
 * ・int型の変数がpointを宣言し85を代入する
 * ・pointの値が80以上なら「合格」と表示する
 * ・上記でなければ「再受験」と表示する
 */
public class ex20 {
    public static void main(String[] args) {
        int point = 79;

        if (point >= 80) {
            System.out.println("合格");
        }else{
            System.out.println("再受験");
        }
    }

}
