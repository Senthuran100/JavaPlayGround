package com.senthuran;

import java.util.HashMap;
import java.util.Map;

public class findMaxIntegerinArray {

    public static int findMajorityElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int element = arr[0];
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) > maxCount) {
                maxCount = map.get(i);
                element = i;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        int arr[] = {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2};
        System.out.println(findMajorityElement(arr));
    }
}
