package com.senthuran;

public class CoinChange {

    public static int count(int[] S, int target) {
        int[] T = new int[target + 1];
        T[0] = 1;
        for (int i = 0; i < S.length; i++) {
            for (int j = S[i]; j <= target; j++) {
                T[j] += T[j-S[i]];
            }
        }
        return T[target];
    }

    public static void main(String[] args) {
        int[] S = {1, 2, 3};

        int target = 4;

        System.out.println("The total number of ways to get the desired change is "
                + count(S, target));

    }
}
