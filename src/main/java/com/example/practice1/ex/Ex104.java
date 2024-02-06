package com.example.practice1.ex;


/**
 * 演習４
 * Carクラスのオブジェクトを生成
 */
public class Ex104 {
    
    public static void main(String[] args) {
        
        Car estima = new Car(50, "エスティマ", 100);

        estima.display();

        Car prius = new Car(30, "プリウス", 20);

        prius.display();
    }
}
