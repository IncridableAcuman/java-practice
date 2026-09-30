package com.web.java_dsa.kepuz.basic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatetimeHozirgiSana {
    public static void main(String[] args) {
        // https://kep.uz/problems/148
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        String format = now.format(formatter);
        System.out.println(format);
    }
}
