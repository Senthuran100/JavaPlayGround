package com.senthuran;

import java.util.Arrays;

public class ArrayArrangeEvenOdd {

    public static int[] orderEvenOdd(int[] number) {
        int j = -1, temp;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                j++;
                temp = number[i];
                number[i] = number[j];
                number[j] = temp;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int arr[] = {12, 10, 9, 45, 2, 10, 10, 45};
        int[] segregatednumbers = orderEvenOdd(arr);
        System.out.println(Arrays.toString(arr));;
    }
}
