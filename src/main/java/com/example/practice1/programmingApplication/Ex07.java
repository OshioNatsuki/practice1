package com.example.practice1.programmingApplication;

import java.time.LocalDate;
/**
 * 演習７
 * 自分の生年月日を表示させる
 */
public class Ex07 {
    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.of(1998, 8, 9);

        int year= localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();

        System.out.println("私の誕生日は" + year + "年" + month + "月" + day + "日");


        
    }
}
