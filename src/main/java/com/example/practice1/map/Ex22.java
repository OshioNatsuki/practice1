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

public record Ex22() {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("東京", "東京");
        map.put("埼玉", "さいたま");
        map.put("神奈川", "横浜");
        map.put("沖縄", "那覇");

        for (Map.Entry<String, String> emtory : map.entrySet()) {
            System.out.println(emtory.getKey() + "の県庁所在地は" + emtory.getValue());
        }

    }

}
