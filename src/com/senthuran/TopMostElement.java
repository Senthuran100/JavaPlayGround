package com.senthuran;

import java.util.*;

public class TopMostElement {

    public static void topKElement(int[] array, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {

            map.put(array[i],
                    map.getOrDefault(array[i], 0) + 1);
        }
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        System.out.println("List" + list);

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (o1.getValue() == o2.getValue())
                    return o2.getKey() - o1.getKey();
                else
                    return o2.getValue()
                            - o1.getValue();
            }
        });

        for (int i = 0; i < k; i++)
            System.out.println(list.get(i).getKey());
    }

    public static void main(String[] args) {
        int array[] = {2, 2, 1, 1, 1, 3};
        topKElement(array, 2);
    }
}
