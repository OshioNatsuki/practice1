package com.example.practice1.rpg;

public class Character {
    
    private int hp;
    private String name;

    public void showHp(){
        System.out.println( name + "の現在のHP:" + hp + "です");
    }
    
    public void attack(Character ch){
        System.out.println(name + "の攻撃！");
        ch.hp = ch.hp - 5;
        System.out.println(ch.name + "のHPは" + ch.hp + "になりました");
    }
    
    public void downHp(int hp){

        this.hp = this.hp - hp;
        if(this.hp < 0){
            this.hp = 0;
        }

    }

    public Character(){
    }

    public Character(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

