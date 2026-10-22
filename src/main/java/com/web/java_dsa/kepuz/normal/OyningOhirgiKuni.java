package com.web.java_dsa.kepuz.normal;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OyningOhirgiKuni {
    public static void main(String[] args) {
        // https://kep.uz/problems/848
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(text,formatter);
        int day = date.getDayOfMonth();
        int month = date.lengthOfMonth();
        System.out.println((month == day || month - day == 1) ? "Yes" : "No");
    }
}
