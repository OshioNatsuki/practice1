package com.example.practice1.programmingApplication;

/**
 * 演習４
 * ””という文字列が空文字かどうかisEmpty()メソッドで調べてください
 */
public abstract class Ex04 {

    public static void main(String[] args) {

        String word = "";

        if (word.isEmpty()) {
            System.out.println("空文字です");
        } else {
            System.out.println("空文字ではありません");
        }
    }
}
