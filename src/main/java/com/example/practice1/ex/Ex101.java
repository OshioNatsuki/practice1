package com.example.practice1.ex;

/**
 * オブジェクト指向　演習１　Carクラスをインスタンス化
 */
public class Ex101 {
    public static void main(String[] args) {
        
        Car car = new Car();

        car.speed = 0;
        car.name = "エスティマ";

        car.stepOnAccele();
        car.stepOnAccele();
        car.stepOnBreak();

        System.out.println(car.speed);
    }
}
