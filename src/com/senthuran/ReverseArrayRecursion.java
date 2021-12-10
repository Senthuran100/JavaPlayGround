package com.senthuran;

public class ReverseArrayRecursion {

    public static int[] backwardArray(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            backwardArray(arr, start + 1, end - 1);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] reversedArray = backwardArray(arr,0,arr.length-1);
        for (int i:reversedArray) {
            System.out.println("Element "+i );
        }
    }
}
