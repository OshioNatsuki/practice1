package com.example.practice1.programmingApplication;

public class Ex06 {
    public static void main(String[] args) {
        
        Human human = new Human();

        human.setName("なつき");
        human.setAge(25);
        human.setBirthplace("よこはま");

        System.out.println(human.toString());
    }
}

