package com.web.java_dsa.kepuz.medium;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingIkkiSana {
    public static void main(String[] args) {
        // https://kep.uz/problems/276
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()){
            System.out.println(0);
            return;
        }
        String prefix = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\d{2}\\.\\d{2}\\.\\d{4}");
        Matcher matcher = pattern.matcher(prefix);

        List<String> list = new ArrayList<>();
        while (matcher.find()){
            list.add(matcher.group());
        }
        if (list.size() < 2){
            System.out.println(0);
            return;
        }
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.uuuu").withResolverStyle(ResolverStyle.STRICT);
            LocalDate first = LocalDate.parse(list.get(0),formatter);
            LocalDate second = LocalDate.parse(list.get(1),formatter);
            long days = ChronoUnit.DAYS.between(first,second);
            System.out.println(Math.abs(days));
        } catch (Exception e) {
            System.out.println(0);

        }
    }
}
