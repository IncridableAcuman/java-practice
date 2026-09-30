package com.web.java_dsa.kepuz.medium;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class IkkiVaqtAyirmasi {
    public static void main(String[] args) {
        // https://kep.uz/problems/1235
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        LocalTime firstLocalTime = LocalTime.parse(first);
        LocalTime secondLocalTime = LocalTime.parse(second);
        long totalSeconds = Duration.between(secondLocalTime,firstLocalTime).toSeconds();

        if (totalSeconds < 0){
            totalSeconds += 24 * 3600;
        }
        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;

        System.out.printf("%02d:%02d:%02d\n",hours,minutes,seconds);
    }
}
