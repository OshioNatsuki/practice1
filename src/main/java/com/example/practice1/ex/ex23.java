package com.example.practice1.ex;

/**
 * ・int型の変数pointを宣言し70を代入する
 * ・pointの値が60未満であれば「NG」と出す
 * ・pointの値が60以上80未満であれば「SO SO」と表示する
 * ・上記以外であれば「OK」と表示する
 * ・また、pointの値を適当に変更し動作確認をおこなう
 */
public class ex23 {
    public static void main(String[] args) {
        int  point = 100;

        if (point < 60) {
            System.out.println("「NG」");
        }if(point >= 60 && point <= 80){
            System.out.println("「SO SO」");
        }if(point > 80){
            System.out.println("「OK」");
        }
    }
}
