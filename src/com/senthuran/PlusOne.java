package com.senthuran;

import java.util.Arrays;

public class PlusOne {

    public static int[] addOneElement(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * Math.pow(10, arr.length - i - 1);
        }
        sum += 1;

        int array[] = new int[Integer.toString(sum).length()];
        int count = Integer.toString(sum).length();

        while (sum > 0) {
            array[count - 1] = sum % 10;
            count--;
            sum = sum / 10;
        }
        return array;
    }

    public static void main(String[] args) {
        int array[] = {9};
        int[] A = addOneElement(array);
        Arrays.stream(A).forEach(System.out::print);
    }
}
