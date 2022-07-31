package com.senthuran;

import java.util.HashMap;

public class RefStringCount {

    public static void countCharcters(String refString, String InputString) {
        for (char c : InputString.toLowerCase().toCharArray()) {
            long count = refString.toLowerCase().chars().filter(x -> x == c).count();
            System.out.println("Character " + c + " count " + count);
        }
    }

    public static void main(String[] args) {
        String input = "Hello World Please";
        String refString = "Help";
        countCharcters(input, refString);
    }
}
