package com.example.practice1.programmingApplication;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * 演習８
 * うるう年である２０２０年2月の月末を常時してください
 */
public class Ex08 {
    
    public static void main(String[] args) {
        
        LocalDate day = LocalDate.of(2020, 2, 1);
        day = day.with(TemporalAdjusters.lastDayOfMonth());

        int lastDay = day.getDayOfMonth();
        
        System.out.println( lastDay );
    }
}
