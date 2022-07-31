package com.senthuran;

import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SampleProgrammin {

    public static int findMinimumNumber(int[] array){

        Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            if(i==array[i-1]){
                continue;
            } else {
                return i;
            }

        }
        return 1;
    }

    public static void main(String[] args) {
       int[] array={};
        System.out.println("Minimum Number "+findMinimumNumber(array));
    }
}
