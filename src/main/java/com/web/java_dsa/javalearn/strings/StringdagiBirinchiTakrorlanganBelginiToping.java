package com.web.java_dsa.javalearn.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringdagiBirinchiTakrorlanganBelginiToping {
    public static void main(String[] args) {
        // Stringdagi birinchi takrorlangan belgini toping.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        map
                .entrySet()
                .stream()
                .filter(entry-> entry.getValue() >=2)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
