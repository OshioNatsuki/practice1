package com.example.practice1.ex;

/**
 * 演習103
 * 自分の名前入れる
 * おにぎりたべる
 * 友達の名前入れる
 * カレーたべさせる
 */
public class Ex103 {
    public static void main(String[] args) {
        
    Human human1 = new Human();
    human1.lastName = "大汐";
    human1.fristName ="ナツキ";
    human1.sayMyName();
    human1.eat("おにぎり");

    Human human2 = new Human();
    human2.lastName = "おおしお";
    human2.fristName = "チェリー";
    human2.sayMyName();
    human2.eat("カレー");
    }
}

