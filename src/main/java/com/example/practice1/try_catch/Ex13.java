package com.example.practice1.try_catch;

public class Ex13 {
    
    public static void main(String[] args) {
        
        try {

            Class.forName("java.lang.java.lang.NotFoundClass");
        } catch (ClassNotFoundException e){
            System.out.println("クラスが見つかりません");
        }
    }
}
