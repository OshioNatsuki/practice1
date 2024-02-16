package com.example.practice1.programmingApplication;

/**
 *  演習３
 * "I have a apple"と"I have an apple"が
 * 同じ文字列か調べてください
 */
public class Ex03 {
    
    public static void main(String[] args) {
        
        String message1 = "I have a apple";
        String message2 = "I have an apple";

        if(message1.equals(message2)){
            System.out.println("同じ文字列です");
        }else{
            System.out.println("異なる文字列です");
        }
    }
}
