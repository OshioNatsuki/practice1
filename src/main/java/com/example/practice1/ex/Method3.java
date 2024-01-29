package com.example.practice1.ex;

public class Method3 {
    
    public static void main(String[] args) {
        int result1 = add(1,2);
        System.out.println(result1);

        int result2 = add(3, 5);
        System.out.println(result2);
    }

    static int add(int num1, int num2){
        int answer = num1 + num2;
        return answer;
    }
}
