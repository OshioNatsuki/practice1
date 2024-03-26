package com.example.practice1.try_catch;

public class Ex14 {

    public void method1() throws Exception {
        Class.forName("java.lang.nonExistClass");
    }

    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("クラスが見つかりません");
        } catch (Exception e) {
            // Handle the exception here
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

