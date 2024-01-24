package com.example.practice1.ex;

public class breakEx {
    
    public static void main(String[] args) {
        
    int loopBreakCount = 3;

    for(int i = 1; i <=5; i++){
        System.out.println( i + "回目");
        
        if(i == loopBreakCount){
            break; //1が３になったらループを終了
        }
    }
    }
}
