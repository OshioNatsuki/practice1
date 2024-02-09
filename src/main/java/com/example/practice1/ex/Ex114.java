package com.example.practice1.ex;

public class Ex114 {
    public static void main(String[] args) {
        
        Ex114Traiathlete traiathlete = new Ex114Traiathlete("自宅", "てぶら");

        traiathlete.move("サイクリングロード");
        traiathlete.changeTool("自転車");
        traiathlete.training();
        traiathlete.move("海");
        traiathlete.changeTool("シューズ");
        traiathlete.training();
        traiathlete.move("公園");
        traiathlete.changeTool("シューズ");
        traiathlete.training();
    }
}
