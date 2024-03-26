package com.example.practice1.array_list;

import java.util.ArrayList;
public class Ex19 {
    public static void main(String[] args) {
        
    ArrayList<String> names = new ArrayList<>();

    names.add("佐藤");
    names.add("小田");
    names.add("山田");
    names.remove(0);
    names.add(1,"鈴木");
    System.out.println("３番目は" + names.get(2));
    for(String name :names){
        System.out.println(name);
    }
    }
}
