package com.web.java_dsa.kepuz.basic;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatetimeYangiYil1 {
    public static void main(String[] args) {
        // https://kep.uz/problems/608
        LocalDate now = LocalDate.now();
        LocalDate newYear = LocalDate.of(2027,1,1);
        long days = ChronoUnit.DAYS.between(now,newYear);
        System.out.println(days);
    }
}
