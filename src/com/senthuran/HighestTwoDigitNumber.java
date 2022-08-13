package com.senthuran;

public class HighestTwoDigitNumber {

    public int highestTwoDigit(int number) {
        int max = -1;
        String numberString = Integer.toString(number);
        if (numberString.length() == 1) {
            return number;
        }
        for (int i = 0; i < numberString.length() - 1; i++) {
            int twoDigit = Integer.parseInt(numberString.substring(i, i + 2));
            if (twoDigit > max) {
                max = twoDigit;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        HighestTwoDigitNumber highestTwoDigitNumber = new HighestTwoDigitNumber();
        int maxNum = highestTwoDigitNumber.highestTwoDigit(90099);
        System.out.println(" Highest Two Digit Number is : " + maxNum);
    }
}
