package com.senthuran;

import java.util.HashSet;
import java.util.Set;

public class SumofArray {

    // Find the pair with a given target.
    public static void findPair(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Combinations are :" + arr[i] + " " + arr[j]);
                }
            }
        }
    }

    // Check array with 0 sum exsist or not
    public static boolean checkZeroSum(int arr[]) {

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(0);
        int sum = 0;
        for (int i : arr) {
            sum += i;
            if (integerSet.contains(sum)) {
                return true;
            }
            integerSet.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {10, 12, 89, 6, -4,-4,2};
        int target = 22;
        findPair(array, target);
        System.out.println("checkZeroSum " + checkZeroSum(array));
    }
}
