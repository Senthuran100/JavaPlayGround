package com.senthuran;

public class LongestSubString {
    public static int lengthOfLongestSubstring(String str) {
        String text = "";
        int maxLength = -1;
        if (str.isEmpty()) {
            return 0;
        }
        if (str.length() == 1) {
            return 1;
        }
        for (char c : str.toCharArray()) {
            if (text.contains(String.valueOf(c))) {
                text = text.substring(text.indexOf(c) + 1);
            }
            text += String.valueOf(c);
            maxLength = Math.max(text.length(), maxLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcaadef"));
    }
}
