package com.example.practice1.resolveProgrammingApplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * 演習９
 * 2020年1月1日0時0分0秒の1年2ヶ月3日4時間5分6秒後を表示させてください
 */
public class Ex09 {
    public static void main(String[] args) {
        
        LocalDateTime localDateTime = LocalDateTime.of(2020, 1, 1, 0, 0, 0);

        localDateTime = localDateTime.plusYears(1);
        localDateTime = localDateTime.plusMonths(2);
        localDateTime = localDateTime.plusDays(3);
        localDateTime = localDateTime.plusHours(4);
        localDateTime = localDateTime.plusMinutes(5);
        localDateTime = localDateTime.plusSeconds(6);

        System.out.println(localDateTime);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("YY年MM月dd日hh時mm分ss秒");

        System.out.println( localDateTime.format(format));

    }
}
