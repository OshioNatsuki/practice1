package com.example.practice1.ex;

public class Ex47 {

    public static void main(String[] args) {
        double averge = averge(79, 80, 100);
        System.out.println(averge);
    }




    static double averge(int num1, int num2, int num3){
        double ave = (num1 + num2 + num3)/ 3;
        return ave;
    }
}
