package com.senthuran;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class JavaStream {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        List<Integer> square = number.stream().map(x -> x * x).
                collect(Collectors.toList());
        number.stream().filter(x -> x > 3).forEach(System.out::println);
        System.out.println(square);

        List<String> stringList = Arrays.asList("foo","bar","baz");
        List<String> startsWithB = stringList.stream().filter(a->a.startsWith("b")).collect(Collectors.toList());
        System.out.println(startsWithB);

    }


}
