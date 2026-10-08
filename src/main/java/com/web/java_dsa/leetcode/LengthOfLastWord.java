package com.web.java_dsa.leetcode;

import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        // https://leetcode.com/problems/length-of-last-word/description/
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split("\\s+");
        System.out.println(words[words.length - 1].length());
    }
}
