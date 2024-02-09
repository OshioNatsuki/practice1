package com.example.practice1.rpg;

public class Monster extends Character implements Appear {
    
    public void show(){
        System.out.println( getName() + "が現れた！");
        System.out.println("現在のHP" + getHp());
    }
}


