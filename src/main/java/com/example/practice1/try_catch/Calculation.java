package com.example.practice1.try_catch;

public class Calculation {
    
    static int execute(int firstNum, char operator , int secondNum) throws ArithmeticException{

        int answer = 0;
        if (operator == '+') {
            answer = firstNum + secondNum;
        } else if (operator == '-') {
            answer = firstNum - secondNum;
        } else if (operator == '*') {
            answer = firstNum * secondNum;
        } else if (operator == '/') {
            answer = firstNum / secondNum;
        } else {
            throw new ArithmeticException("演算子が不正です");
        }
        return answer;
    }
}
