package com.senthuran;

public class RomanNumberConversion {

    public int convert(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return -1;
    }

    public int convertToNumber(String roman) {
        int res = 0;
        for (int i = 0; i < roman.length(); i++) {
            int s1 = convert(roman.charAt(i));
            if (i + 1 < roman.length()) {
                int s2 = convert(roman.charAt(i + 1));
                if (s1 >= s2) {
                    res = res + s1;
                } else {
                    res = res + s2 - s1;
                    i++;
                }
            } else {
                res = res + s1;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        RomanNumberConversion numberConversion = new RomanNumberConversion();
        int number = numberConversion.convertToNumber("XII");
        System.out.println(" Number is " + number);
    }
}
