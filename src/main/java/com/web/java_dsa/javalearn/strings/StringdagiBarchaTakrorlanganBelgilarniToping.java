package com.web.java_dsa.javalearn.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringdagiBarchaTakrorlanganBelgilarniToping {
    public static void main(String[] args) {
        // Stringdagi barcha takrorlangan belgilarni toping.
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
                .filter(entry-> entry.getValue() >=2)
                .forEach(entry-> System.out.println("Key=" + entry.getKey() + " Value=" + entry.getValue()));
    }
}
