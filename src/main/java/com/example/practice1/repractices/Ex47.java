package com.example.practice1.repractices;

/**
 * 演習４７
 * int型の引数を３つ指定して呼び出せるメソッドaverageを定義する
 * average()メソッド内では引数で指定された３つの値の平均値を求め、その値を戻り値として
 * 呼び出し元に返す
 * main()メソッド内でaverage()メソッドを呼びたし戻り値で帰ってく７９、８０、１００の平均値を表示する
 * 
 * 表示：「86.3333333」
 */
public class Ex47 {
    
    public static void main(String[] args) {
        double result = average(79,80,100);
        System.out.println(result);
    }

    static double average(int num1,int num2,int num3){
        double answer = (num1 + num2 + num3) / 3.0;
        return answer;
    }
}
