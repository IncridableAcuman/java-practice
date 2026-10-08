package com.web.java_dsa.kepuz.normal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DatetimeKeyingiOy {
    public static void main(String[] args) {
        // https://kep.uz/problems/611
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(text,formatter);
        LocalDate next = date.plusMonths(1);
        long days = ChronoUnit.DAYS.between(date,next);
        System.out.println(days - date.getDayOfMonth() + 1);
    }
}
