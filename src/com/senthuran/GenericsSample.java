package com.senthuran;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GenericsSample {

    public static <T> List<List<T>> partitionList(List<T> list) {
        final int G = 3;
        final int NG = (list.size() + G - 1) / G;

        return IntStream.range(0, NG).mapToObj(i -> list.subList(G * i, Math.min(G * i + G, list.size()))).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "b", "c", "a", "c", "a", "b");

        List<List<String>> partitionedList = partitionList(list);

        partitionedList.stream().forEach(x -> System.out.println(x));

        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList, 1, 2, 3, 4, 5, 6, 2, 6, 2);

        List<List<Integer>> partitionedIntegerList = partitionList(integerList);

        partitionedIntegerList.stream().forEach(System.out::println);
    }
}
