package com.web.java_dsa.kepuz.basic;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DatetimeYangiYil2 {
    public static void main(String[] args) {
        // https://kep.uz/problems/609
        LocalDate newYear = LocalDate.of(2027,1,1);
        DayOfWeek dayOfWeek = newYear.getDayOfWeek();
        System.out.println(dayOfWeek.getValue());
    }
}
