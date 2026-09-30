package com.web.java_dsa.kepuz.normal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class KelgusiSana2 {
    public static void main(String[] args) {
        // https://kep.uz/problems/150
        LocalDateTime now = LocalDateTime.now().plusDays(100);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String format = now.format(formatter);
        System.out.println(format);
    }
}
