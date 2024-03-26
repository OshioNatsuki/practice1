package com.example.practice1.try_catch;

public class Car {

    private int speed;

    
    public Car(int speed) {
        this.speed = speed;
    }

    public Car(){

    }

    public void run(int speed) throws IllegalArgumentException {

        try {
            if (speed < 0 || speed > 180) {
                throw new IllegalArgumentException("スピードの出し過ぎです");
            } else {
                speed = this.speed + speed;
                System.out.println("スピードが" + speed + "になりました");
            }
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


    public int getSpeed() {
        return speed;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }
}