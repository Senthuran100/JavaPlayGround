package com.senthuran;

import java.util.Arrays;

public class UniqueSortedArrayElements {

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[nums.length - 1];
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6};
        int uniqueElements = removeDuplicates(nums);
        for (int i = 0; i < uniqueElements; i++) {
            System.out.println(nums[i]);
        }
    }
}
