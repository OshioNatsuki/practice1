package com.example.practice1.object2;

public class Pcs implements Electeical{

    private boolean powerOn;

    @Override
    public void power() {
        if(powerOn){
            powerOn = false;
            System.out.println("PCの電源が切れました");
        }else{
            System.out.println("設定ファイルを読み込んでいます");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            powerOn = true;
            System.out.println("PCの電源が入りました");
        }
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public boolean isPowerOn() {
        return powerOn;
    }
}
