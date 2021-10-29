package com.senthuran;

import java.util.*;

public class DuplicateArray {

    public static List<Integer> findDuplicate(int[] array) {
        Map<Integer, Integer> elements = new HashMap<>();
        List<Integer> newArray = new ArrayList<>();
        for (int i : array) {
            if (elements.containsKey(i)) {
                elements.put(i, elements.get(i) + 1);
            } else {
                elements.put(i, 1);
            }
        }
        int i = 0;
        for (int key : elements.keySet()) {
            if (elements.get(key) > 1) {
                newArray.add(key);
            }
        }

//        elements.keySet().stream().forEach((x) -> {
//            int i = 0;
//            if (elements.get(x) > 1) {
//                newArray[i] = x;
//                i++;
//            }
//
//        });
        return newArray;
    }

    public static void findMaxLenSubarray(int[] arr, int S) {
        int target = 0;
        int length = 0;
        int endIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            target = 0;
            for (int j = i; j < arr.length; j++) {
                target += arr[j];
                if (S == target) {
                    if (length < j - i + 1) {
                        length = j - i + 1;
                        endIndex = j;
                    }
                }
            }

        }
        System.out.println("Maximum length sub array:" + length + "  [" + (endIndex - length + 1) + "," + endIndex + "]");
    }

    public static int maxProduct(int num[]) {
        int product = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] * num[j] > product) {
                    product = num[i] * num[j];
                }
            }
        }
        return product;
    }

    public static boolean isIsomorphic(String A, String B) {
        if (A == null || B == null) {
            return false;
        }
        if (A.length() != B.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < A.length(); i++) {
            char X = A.charAt(i);
            char Y = B.charAt(i);
            if (map.containsKey(X)) {
                if (map.get(X) != Y) {
                    return false;
                }
            } else {
                if (set.contains(Y)) {
                    return false;
                }
                map.put(X, Y);
                set.add(Y);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {23, 63, 34, 23, 89, 4, 45, 93, 63};

        int[] nums = {5, 6, -5, 5, 3, 5, 3, -2, 0};
        int target = 8;

        findDuplicate(array).stream().forEach(System.out::println);
        findMaxLenSubarray(nums, target);
        System.out.println("Maximum product " + maxProduct(nums));

        System.out.println(isIsomorphic("ACAB", "XCCY"));

    }
}
