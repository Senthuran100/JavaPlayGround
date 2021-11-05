package com.senthuran;

import java.util.Arrays;

/*
Given an integer array, rearrange it such that every second element
becomes greater than its left and right elements. Assume no duplicate
 elements are present in the array.
 */
public class alternateHighLow {

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void reArrange(int[] arr) {
        for (int i = 1; i < arr.length; i = i + 2) {
            if (arr[i - 1] > arr[i]) {
                swap(arr, i - 1, i);
            }
            if (i + 1 < arr.length && arr[i + 1] > arr[i]) {
                swap(arr, i + 1, i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 10, 3, 7};
        reArrange(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
