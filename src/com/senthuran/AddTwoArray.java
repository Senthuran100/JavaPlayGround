package com.senthuran;

import java.util.ArrayList;
import java.util.List;

/*
Given two arrays of positive integers, add their elements into a new array. The solution should add both arrays,
one by one starting from the 0th index, and split the sum into individual digits if it is a 2–digit number.
 */
public class AddTwoArray {

    public static void recursion(int number, List<Integer> list) {
        if (number > 0) {
            recursion(number / 10, list);
            list.add(number % 10);
        }
    }

    public static ArrayList<Integer> addTwo(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int length = arr1.length > arr2.length ? arr1.length : arr2.length;
        for (int i = 0; i < length; i++) {
            int sum = 0;
            sum = i < arr1.length ? arr1[i] : 0;
            sum += i < arr2.length ? arr2[i] : 0;
            if (sum < 10) {
                list.add(sum);
            } else {
                recursion(sum, list);
            }
        }
        return (ArrayList<Integer>) list;
    }


    public static void main(String[] args) {
        int arr1[] = {23, 5, 2, 7, 87};
        int arr2[] = {4, 67, 2, 8};

        System.out.printf("Merge Array" + addTwo(arr1, arr2));

    }
}
