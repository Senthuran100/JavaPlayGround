package com.senthuran;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class largestDistinctSubArray {

    public static int[] largestSubArray(int[] arr) {
        int maxCount = 0;
        int endIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < arr.length; j++) {
                set.add(arr[j]);
                if (set.size() == j - 1 + 1) {
                    if (j - i + 1 > maxCount) {
                        maxCount = j - i + 1;
                        endIndex = j;
                    }
                } else {
                    break;
                }
            }
        }
        return Arrays.copyOfRange(arr, (endIndex - maxCount + 1), endIndex+1);

    }

    public static void main(String[] args) {
        int arr[] = {2, 0, 2, 1, 4, 3, 1, 0};
        Arrays.stream(largestSubArray(arr)).forEach(System.out::print);

    }
}
