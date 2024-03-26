package com.example.practice1.resolveProgrammingApplication;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
/**
 * 演習８
 * うるう年である２０２０年2月の月末を表示してください
 */
public class Ex08 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2020, 2, 1);

        localDate = localDate.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(localDate);
    }

}
