package com.example.practice1.ex;

/**
 * 以下の条件を満たすプログラムを作成してください
 * ・int型の変数radiusを宣言し、２０で初期化する
 * ・double型の定数PAIを宣言し、３．１４で初期化する
 * 円の面積を求めます。PAI * radius * radius を計算して結果を整数型にキャストしてください
 */
public class ex14 {
    
    public static void main(String[] args) {
        
        int radius = 20;
        final double PAI = 3.14;
        double circle =  PAI * (double)radius * (double)radius;
        System.out.println((int)circle);
    }
}
