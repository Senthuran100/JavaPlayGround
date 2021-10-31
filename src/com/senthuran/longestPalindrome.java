package com.senthuran;

public class longestPalindrome {

    public static String intermediatePalindrome(String A, int left, int right) {
        if (left > right) return null;
        while (left >= 0 && right < A.length() && A.charAt(left) == A.charAt(right)) {
            left--;
            right++;
        }
        return A.substring(left + 1, right);
    }

    public static String longestPalindromeString(String A) {
        if (A == null) return null;
        String longest = A.substring(0, 1);
        for (int i = 0; i < A.length(); i++) {
            // Odd Palindrom
            String oddPalindrome = intermediatePalindrome(A, i, i);
            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }

            // Even Palindrome
            String evenPalindrome = intermediatePalindrome(A, i, i + 1);
            if (evenPalindrome.length() > longest.length()) {
                longest = evenPalindrome;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String S = "1223213";
        System.out.println(" Longest Palindrome " + longestPalindromeString(S));

    }
}
