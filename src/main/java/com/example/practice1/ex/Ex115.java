package com.example.practice1.ex;

public class Ex115 {
    
    public static void main(String[] args) {
        
        Ex115Bicycle bicycle = new Ex115Bicycle("北");

        bicycle.trunLeft();
        bicycle.turnRight();
        bicycle.trunLeft();
        bicycle.trunLeft();
        bicycle.turnRight();
        bicycle.trunLeft();
        bicycle.display();
    }
}
