package com.example.practice1.repractices;

/**
 * 演習１６
 * 配列問題
 * 要素数が１０ののString型配列を生成し、配列の０番目と５番目に自分の名前を代入してください
 * 上記で作成した配列の中身を拡張for文で表示させてください
 * 値がnullの場合は「空」が表示されるようにしてください
 */
public class Ex116 {

    public static void main(String[] args) {
        
        String[] names = {"夏生", null, null, null, null,"夏生", null, null, null, null, null };
        
        for(String name:names){
                if (name == null) {
                    System.out.println(" 空 ");
                } else {
                    System.out.println(name);
                }
            }
    }
}
