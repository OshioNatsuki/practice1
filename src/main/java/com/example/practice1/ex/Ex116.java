package com.example.practice1.ex;

/**
 * 演習１６
 * 配列問題
 * １、要素数が５個のint型配列を生成と共に0から４までの値で初期化してください
 * ２、上記で作成した配列の中身を普通のfor文で表示させてください
 * ３、要素数が１０ののString型配列を生成し、配列の０番目と５番目に自分の名前を代入してください
 * ４、上記で作成した配列の中身を拡張for文で表示させてください
 * 値がnullの場合は「空」が表示されるようにしてください
 */
public class Ex116 {

    public static void main(String[] args) {

        int[] numbers = { 0, 1, 2, 3, 4 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        String[] names = { "natuki", null, null, null, "natuki", null, null, null, null, null, };

        for (String name : names) {
            if (name != null) {
                System.out.print(name + "  ");
            } else {
                System.out.print(" " + "空" + " ");
            }

        }
    }
}