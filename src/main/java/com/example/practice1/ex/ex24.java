package com.example.practice1.ex;

/**
 * ・int型の変数、temp,cold,abnormalを宣言しそれぞれ３８、３７、４２を代入する
 * ・tempの値がcoldの以下であれば「正常」
 * ・tempの値がcoldの値より大きく、かつabnormal以下であれば「風邪」と表示する
 * ・tempの値が上記以下であれば「異常」と表示する
 * ・また、tempの値を適当に変更し動作確認する
 */
public class ex24 {
    public static void main(String[] args) {
        
        int temp = 38;
        int cold = 37;
        int abnormal = 42;

        if(temp < cold){
            System.out.println("正常");
        }if(temp >= cold && temp < abnormal){
            System.out.println("風邪");
        }else{
            System.out.println("異常");
        }
    }
}
