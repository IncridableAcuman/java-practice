package com.web.java_dsa.kepuz.normal;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatetimeSoniyalarSoni {
    public static void main(String[] args) {
        LocalDate first = LocalDate.of(1,1,1);
        LocalDate now = LocalDate.now();
        long days = ChronoUnit.DAYS.between(first,now);
        String str = String.valueOf(days * 864000);
        System.out.println(str);
    }
}
