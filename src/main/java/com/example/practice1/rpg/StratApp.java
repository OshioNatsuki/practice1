package com.example.practice1.rpg;

public class StratApp {
    public static void main(String[] args) {
        
        Hero hero = new Hero();
        hero.setName("ロト");
        hero.setHp(20);
        hero.show();
        
        // Monster monster = new Monster();
        // monster.setName("スライム");
        // monster.setHp(10);
        // monster.show();
        
        Slime slime = new Slime();
        slime.setName("スライム");
        slime.attack(hero);
        slime.setHp(10);
        slime.show();
        slime.talk("ぽよよーん");

    }
}
