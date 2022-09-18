package com.senthuran;

public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        int j=0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]!=elem) {
                A[j] = A[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int number = 2;
        int exsistingElements = removeElement.removeElement(nums, 2);
        System.out.println("Removed Elements : " + exsistingElements);
    }
}
