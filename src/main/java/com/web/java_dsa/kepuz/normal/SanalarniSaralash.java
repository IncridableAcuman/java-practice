package com.web.java_dsa.kepuz.normal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class SanalarniSaralash {
    public static void main(String[] args) {
        // https://kep.uz/problems/1278
        // format DD/MM/YYYY
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] dates = new String[n];
        for (int i=0;i<n;i++){
            dates[i] = scanner.next();
        }
        LocalDate[] localDates = new LocalDate[n];
        int j=0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (String str : dates){
            LocalDate localDate = LocalDate.parse(str,formatter);
            localDates[j++]=localDate;
        }
        Arrays.sort(localDates);
        for (LocalDate date : localDates){
            String format = date.format(formatter);
            System.out.println(format);
        }
    }
}
