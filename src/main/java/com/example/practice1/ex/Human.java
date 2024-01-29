package com.example.practice1.ex;

/**
 * 追加演習１０３
 * Humanクラス
 */
public class Human {
    
    //フィールド変数
    String lastName;
    String fristName;
    int power;

    //コンストラクタを定義
    public Human() {
    }

    public Human(String lastName, String fristName, int power) {
        this.lastName = lastName;
        this.fristName = fristName;
        this.power = power;

    }
    //自分の名前を言うメソッド
    void sayMyName(){
        System.out.println(lastName + fristName);
    }
    //食べるメソッド
    //引数で受け取った食べ物を食べた後、エネルギーがどのくらいになったかを表示する
    //おにぎり：パワー１０＋
    //カレー：パワー２０＋
    //それ以外：５＋
    void eat(String food){
        if(food.equals("おにぎり")){
            power = power + 10;
        }else if(food.equals("カレー")){
            power = power + 20;
        }else { 
            power = power + 5;
        }
        System.out.println("パワーは" + power + "になりました");
    }

    public String toString(){
        System.out.println(lastName + fristName + "さんのパワーは" + power + "です");
        return fristName + lastName + power;
    }
}
