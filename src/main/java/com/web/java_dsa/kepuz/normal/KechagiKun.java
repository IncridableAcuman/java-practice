package com.web.java_dsa.kepuz.normal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KechagiKun {
    public static void main(String[] args) {
        // https://kep.uz/problems/1095
        Scanner scanner = new Scanner(System.in);
        String yesterday = scanner.next();
        LocalDate date = LocalDate.parse(yesterday,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate divisioned = date.minusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format = divisioned.format(formatter);
        System.out.println(format);
    }
}
