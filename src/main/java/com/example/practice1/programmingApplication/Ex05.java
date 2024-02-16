package com.example.practice1.programmingApplication;

/**
 * 演習５
 * "阿僧祇：那由多：不可思議：無量大数"を
 * split()を用いて文字列を分けて表示させてください
 */
public class Ex05 {
    

    public static void main(String[] args) {
        
        String words = "阿僧祇：那由多：不可思議：無量大数";
        
        String[] newWords = words.split("：");
        for (String newWord : newWords){
            System.out.println(newWord);

        }
    }
}
