package com.senthuran;

import java.util.Arrays;

public class MinimumSumArray {

    public static int[] minuimumSumArray(int[] arr, int length) {
        int min_sum = Integer.MAX_VALUE;
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < i + length; j++) {
                sum += arr[j];
                if (j == i + 2 && sum < min_sum) {
                    min_sum = sum;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }
        
        return Arrays.copyOfRange(arr, startIndex, endIndex + 1);
    }

    public static void main(String[] args) {
        int arr[] = {10, 4, 2, 5, 6, 3, 8, 1};
        Arrays.stream(minuimumSumArray(arr, 3)).forEach(System.out::print);

    }
}
