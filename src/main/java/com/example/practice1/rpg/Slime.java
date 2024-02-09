package com.example.practice1.rpg;

public class Slime extends Monster {
    
    public void talk(String message){
        System.out.println( getName() + ":「" + message +  "」");
    }
}
