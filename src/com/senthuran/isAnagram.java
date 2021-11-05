package com.senthuran;

import java.util.HashMap;
import java.util.Map;

public class isAnagram {

    /*
     * Determine whether two strings are anagram or not
     */
    public static boolean isAnagram(String A, String B) {
        if (A == null || B == null) {
            return false;
        }
        if (A.length() != B.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : A.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : B.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            } else {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    map.remove(c);
                }
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("tommarvoloriddle", "iamlordvoldemort"));
    }
}
