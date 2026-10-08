package com.web.java_dsa.kepuz.basic;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HaftaningOhirgiKuni {
    public static void main(String[] args) {
        // https://kep.uz/problems/847
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(text,formatter);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println((dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) ? "Yes" : "No");
    }
}
