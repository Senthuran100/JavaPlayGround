package com.senthuran;

import java.util.Stack;

public class ReverseString {

    public static String reverseString(String string) {
        String reverseString = "";

        if (string == null || string.length() == 0) {
            return string;
        }
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString += string.charAt(i);
        }
        return reverseString;
    }

    public static char[] reverseStringStack(char[] arr) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        int k = 0;
        while (!stack.isEmpty()) {
            arr[k++] = stack.pop();
        }
        return arr;
    }

    public static void main(String[] args) {
        String S = "ABCD";
        System.out.println(reverseString(S));

        char[] charString = S.toCharArray();
        String str = new String(reverseStringStack(charString));
        System.out.println(str);
    }
}
