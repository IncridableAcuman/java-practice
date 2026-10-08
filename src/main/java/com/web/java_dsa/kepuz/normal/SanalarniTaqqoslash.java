package com.web.java_dsa.kepuz.normal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SanalarniTaqqoslash {
    public static void main(String[] args) {
        // https://kep.uz/problems/930
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String  second = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate firstDate = LocalDate.parse(first,formatter);
        LocalDate secondDate = LocalDate.parse(second,formatter);
        System.out.println((firstDate.equals(secondDate)) ? "=" : firstDate.isAfter(secondDate) ? ">" : "<");

    }
}
