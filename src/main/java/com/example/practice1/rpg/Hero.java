package com.example.practice1.rpg;

public class Hero extends Character implements Appear {
    
    public void show(){
        System.out.println("勇者" + getName() + "の登場");
        System.out.println("現在のHP" + getHp());
    }
}

