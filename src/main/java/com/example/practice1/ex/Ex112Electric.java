package com.example.practice1.ex;

/**
 * 電気自動車を表すクラス
 */
public class Ex112Electric {
    
    int battery;
    boolean power;

    
    public Ex112Electric() {
        
    }

    public Ex112Electric(int battery, boolean power) {
        this.battery = battery;
        this.power = power;
    }

    public void powerOn(){
        if (battery <= 0) {
            System.out.println("充電してください");
        }else{
            power = true;
        }
    }

    public void powerOff(){
        power = false;
    }

    public void chargeToFull(){
        battery = 100;
    }

    public void move(String place){
        if(!power){
            System.out.println("電源をいれてください");
            return;
        }
        System.out.println(place + "へ移動しました");
        battery = battery - 50;

        if(battery <= 0){
            battery = 0;
            power = false;
        }
    }


}
