package com.senthuran;

import java.util.Arrays;
import java.util.HashMap;

public class TargetSum {

    public int[] twoSumWithON2(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public int[] twoSumWithON1(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        TargetSum targetSum = new TargetSum();
        int[] array = new int[]{3, 2, 4};
        int target = 6;
        Arrays.stream(targetSum.twoSumWithON2(array, target)).forEach(x -> System.out.println(x));
        Arrays.stream(targetSum.twoSumWithON1(array, target)).forEach(System.out::println);
    }
}
