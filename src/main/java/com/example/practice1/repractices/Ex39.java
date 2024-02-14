package com.example.practice1.repractices;

/**
 * 演習３９
 * フィボナッチ数列を表示させるプログラムを作成してください
 * 結果が1000を超えた時点で終了してください
 * 1 1 2 3 5 8....
 * previous_current_future
 */
public class Ex39 {
    
    public static void main(String[] args) {

        int num = 0;
        int answer = 1;
    
            for (int i = 1; answer <= 1000; i++){
                
                System.out.print( answer + ", ");
    
                int futureNum = num + answer;
                num = answer;
                answer = futureNum;
                }
            }
}
