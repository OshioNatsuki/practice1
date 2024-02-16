package com.example.practice1.programmingApplication;

/**
 * 演習１
 * ”I have a dream today"
 * ”a”が最初に来る位置が何番目かをStringクラスindexOf()を使用して表示してください
 * 
 */
public class Ex02 {

    
    public static void main(String[] args) {
        
        String words = "I have a dream today";

        System.out.println("「a」は" + words.indexOf("a") + "文字目にきます");
    }
}