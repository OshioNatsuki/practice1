package com.example.practice1.programmingApplication;

import java.time.LocalDateTime;

/**
 * 演習９
 * 2020年1月1日0時0分0秒の1年2ヶ月3日4時間5分6秒後を表示させてください
 */
public class Ex09 {
    public static void main(String[] args) {
        
        LocalDateTime localDateTime = 
        LocalDateTime.of(2020, 1, 1, 0, 0, 0);

        localDateTime = localDateTime.plusYears(1);
        localDateTime = localDateTime.plusMonths(2);
        localDateTime = localDateTime.plusDays(3);
        localDateTime = localDateTime.plusHours(4);
        localDateTime = localDateTime.plusMinutes(5);
        localDateTime = localDateTime.plusSeconds(6);

        System.out.println(localDateTime);
        
    }
}
