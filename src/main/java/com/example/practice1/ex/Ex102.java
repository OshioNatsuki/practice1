package com.example.practice1.ex;

/**
 * 演習２
 * Carクラスのオブジェクトを２つ生成してメソッドを呼び出す
 */
public class Ex102 {
    
    public static void main(String[] args) {
        
        Car car = new Car();
        
        /**
         * 名前：エスティマ
         * speed:50
         * アクセル２回、ブレーキ１回
         */
        car.name = "エスティマ";
        car.speed = 50;

        car.stepOnAccele();
        car.stepOnAccele();
        car.stepOnBreak();
        System.out.println("エスティマの速度は" + car.speed + "km/Mです");
        
        /**
         * 名前：プリウス
         * speed:30
         * アクセル5回、ブレーキ3回
         */
        car.name = "プリウス";
        car.speed = 30;

        for (int i = 0; i < 5; i++) {
            car.stepOnAccele();
        }
        for (int i = 0; i < 3; i++) {
            car.stepOnBreak();
        }
        System.out.println("プリウスの速度は" + car.speed + "km/Mです");
    }
}
    