package com.senthuran;

public class ReverseInteger {

    public static int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
        }
        int number = Math.abs(x);
        long reverseNumber = 0;
        while (number > 0) {
            int rem = number % 10;
            number = number / 10;
            reverseNumber = reverseNumber * 10 + rem;
        }
        if (reverseNumber < Integer.MIN_VALUE || reverseNumber > Integer.MAX_VALUE) {
            return 0;
        }
        return isNegative ? -1 * (int) reverseNumber : (int) reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println(" Conversion of Number : " + reverse(1534236469));
    }
}
