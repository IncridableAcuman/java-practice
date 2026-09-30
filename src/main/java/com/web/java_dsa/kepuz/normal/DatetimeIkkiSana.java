package com.web.java_dsa.kepuz.normal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DatetimeIkkiSana {
    public static void main(String[] args) {
        // https://kep.uz/problems/610
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        LocalDate firstDate = LocalDate.parse(first, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate secondDate = LocalDate.parse(second,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        long days = ChronoUnit.DAYS.between(firstDate,secondDate);
        System.out.println(days);
    }
}
