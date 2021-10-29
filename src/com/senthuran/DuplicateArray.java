package com.senthuran;

import java.util.*;

public class DuplicateArray {

    public static List<Integer> findDuplicate(int[] array) {
        Map<Integer, Integer> elements = new HashMap<>();
        List<Integer> newArray=new ArrayList<>();
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

    public static void main(String[] args) {
        int[] array = {23, 63, 34, 23, 89, 4, 45, 93, 63};

        findDuplicate(array).stream().forEach(System.out::println);
    }
}
