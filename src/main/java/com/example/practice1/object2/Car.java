package com.example.practice1.object2;

public class Car {
    
    /***
        フィールド変数
     * 速度、名前、ガソリン
     */

    private int speed;
    private String name;

    /**
     * コンストラクタを定義
     */
    public Car(){
    }
    
    public Car(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }
    
    /**
     * アクセルを踏む
     * 速度を１０増やす
     * ガソリンを１０減らす
     */
    void stepOnAccele(){
        speed = speed + 10;
    }
    /**
     //ブレーキを踏む
     * 速度を１０減らす
     */
    void stepOnBreak(){
        speed = speed - 10;
    }

    /**
     * フィールド変数の中身をコンソールに出力するためのメソッド
     */
    void display(){
        System.out.println(name + "の速度は" + speed + "km/hです" );
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
