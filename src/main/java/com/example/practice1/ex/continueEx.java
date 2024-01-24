package com.example.practice1.ex;

public record continueEx() {
    public static void main(String[] args) {
        int loopBreakCount = 3;

        for (int i = 1; i <=5 ; i++) {
            System.out.println(i + "回目");

            if( i == loopBreakCount){
                System.out.println("スキップします");
                continue;
            }

            System.out.println("for文が実行されました");
        }
    }   
}
