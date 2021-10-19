package com.senthuran;

import java.util.Arrays;

public class SortBinaryArray {

    public static int[] sort(int[] arr) {
        int[] newArr = new int[arr.length];
        int countZero = 0;
        for (int a : arr) {
            if (a == 0)
                countZero++;
        }
        int k = 0;
        while (countZero-- != 0) {
            newArr[k++] = 0;
        }
        while (k < newArr.length) {
            newArr[k++] = 1;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
