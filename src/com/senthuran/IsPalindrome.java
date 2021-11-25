package com.senthuran;

public class IsPalindrome {

    // Check whether the string is palindrome or not.
    public boolean checkPalindrom(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    // Right shift the elements of an array.
    public void rightShiftArray(int[] arr, int n) {
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int newLocation = (i + n) % arr.length;
            output[newLocation] = arr[i];
        }
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + ",");
        }
        System.out.println(" ");
    }

    // left Shift the elements of an array.
    public void leftShiftArray(int[] arr, int n) {
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int newLocation = (i + (arr.length - n)) % arr.length;
            output[newLocation] = arr[i];
        }
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + ",");
        }
    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        String testWord = "blaalb";
        System.out.println(testWord + " is " + (isPalindrome.checkPalindrom(testWord) ? " a palindrome" : " not a palindrome"));
        int[] myIntArray = new int[]{1, 2, 3, 4, 5};
        isPalindrome.rightShiftArray(myIntArray, 2);
        isPalindrome.leftShiftArray(myIntArray, 2);
    }
}
