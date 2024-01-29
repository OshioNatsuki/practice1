package com.example.practice1.repractices;

public class Car {
    
    /***
        フィールド変数
     * 速度、名前、ガソリン
     */

    int speed;
    String name;
    int gasoline;


    /**
     * アクセルを踏む
     * 速度を１０増やす
     * ガソリンを１０減らす
     */
    void stepOnAccele(){
        speed = speed + 10;
        gasoline = gasoline - 10;
    }
    /**
     //ブレーキを踏む
     * 速度を１０減らす
     */
    void stepOnBreak(){
        speed = speed - 10;
    }
    /**
     //給油する
     * @param newGasoline
     * 受け取ったガソリン残量をフィールド変数のガソリン残量に加える
     */
    void refule(int newGasoline){
        gasoline = gasoline + newGasoline;
    }
}
