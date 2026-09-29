package com.web.java_dsa.kepuz.medium;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class IkkiVaqtAyirmasi {
    public static void main(String[] args) {
        // https://kep.uz/problems/1235
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        LocalTime firstLocalTime = LocalTime.parse(first);
        LocalTime secondLocalTime = LocalTime.parse(second);
        LocalTime res = firstLocalTime.plusHours(secondLocalTime.getHour()).plusMinutes(secondLocalTime.getMinute()).plusSeconds(secondLocalTime.getSecond());
        System.out.println(res);
    }
}
