package com.web.java_dsa.javalearn.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringdagiBirinchiTakrorlanmaydiganBelginiToping {
    public static void main(String[] args) {
        // Stringdagi birinchi takrorlanmaydigan belgini toping.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        map
                .entrySet()
                .stream()
                .filter(entry->entry.getValue() == 1)
                .findAny()
                .ifPresent(entry-> System.out.print(entry.getKey()));
    }
}
