package com.example.practice1.try_catch;

import jakarta.el.ELException;

public class Ex12 {
    
    public static void main(String[] args) {
        
        try{
            int answer = 10/0;
            System.out.println(answer);
        }catch(ArithmeticException e){
            System.out.println("0で割ることができません");
        }
    }
}

