package com.example.practice1.map;
/**
 * HashMapオブジェクトをインスタンス化する
 * mapに下記を格納する
 * ("東京", "東京");
 * ("埼玉", "さいたま");
 * 埼玉を指定して、表示する
 * System.out.println("埼玉の県庁所在地は" + ○○ + "です");
 */
import java.util.Map;
import java.util.HashMap; // Import the HashMap class

public record Ex21() {
    
    public static void main(String[] args) {
        
        Map<String,String> map = new HashMap<>();

        map.put("東京", "東京");
        map.put("埼玉", "さいたま");

        String place = map.get("埼玉");
        System.out.println("埼玉の県庁所在地は" + place + "です");
    }

}
