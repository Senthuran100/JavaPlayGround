package com.senthuran;

public class LongestCommonPrefix {

    private static String CommonPrefixUtil(String prefix, String str) {
        String result = "";
        for (int i = 0, j = 0; i < prefix.length() && j < str.length(); i++, j++) {
            if (prefix.charAt(i) != str.charAt(j)) {
                break;
            }
            result += prefix.charAt(i);
        }
        return result;
    }

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = CommonPrefixUtil(prefix, strs[i]);
        }
        return prefix;
    }


    public static void main(String[] args) {
        String[] words = {"abcd", "abc", "abcfge"};
        String commonPrefix = longestCommonPrefix(words);
        System.out.println(" Longest Common Prefix : " + commonPrefix);
    }
}
