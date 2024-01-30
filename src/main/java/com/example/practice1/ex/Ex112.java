package com.example.practice1.ex;

/**
 * 演習１２
 * 
 */
public class Ex112 {
    public static void main(String[] args) {
        
        Ex112Electric electric = new Ex112Electric();

        electric.chargeToFull();
        electric.powerOn();
        electric.move("埼玉");
        electric.move("東京");
        electric.move("茨城");
        electric.powerOn();
    }
}
