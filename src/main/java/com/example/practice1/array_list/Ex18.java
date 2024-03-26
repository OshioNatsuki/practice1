package com.example.practice1.array_list;

import java.util.List;
import java.util.ArrayList;
/**
 * Stringオブジェクトを格納するためのArrayListをインスタンス化
 * ArrayListに文字列を追加（佐藤さん、小田さん、山田さん）を追加
 * Sysoutで名前を取り出し、表示
 * 
 */
public class Ex18 {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("佐藤");
        list.add("小田");
        list.add("山田");
    
        for (String name : list){
            System.out.println(name);
        }
    
    }
}
