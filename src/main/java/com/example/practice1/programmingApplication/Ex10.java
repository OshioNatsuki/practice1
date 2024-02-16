package com.example.practice1.programmingApplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 演習１０
 * 2020年7月27日を表示してください
 * 2020/7/27を表示してください
 * 2020年7月27日（月）を表示してください
 */
public class Ex10 {
    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.of(2020, 7, 27);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月dd日");
        String format = localDate.format(formatter);
        System.out.println(format);
        
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/M/dd");
        String format2 = localDate.format(formatter2);
        System.out.println(format2);

        // DateTimeFormatter formmter3 = DateTimeFormatter.ofPattern("yyyy年M月dd日")



    
    }
}
