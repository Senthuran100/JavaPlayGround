package com.senthuran;

import java.util.Arrays;

public class maximumSumArray {

    public static int[] maxSum(int[] arr) {
        int sum = 0;
        int endIndex = 0;
        int startIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            int dynamicSum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                dynamicSum += arr[j];
                if (dynamicSum > sum) {
                    sum = dynamicSum;
                    endIndex = j;
                    startIndex = i;
                }
            }
        }
        return Arrays.copyOfRange(arr, startIndex, endIndex + 1);
    }

    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] maxSumArray = maxSum(array);
        Arrays.stream(maxSumArray).forEach(System.out::print);
    }
}
