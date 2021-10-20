package com.senthuran;

import java.util.HashSet;
import java.util.Set;

public class SmallestPositiveInteger {
    // Maximum Positive Integer Solution
    public int solution(int[] A) {

        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 1;
    }

    public int MaximumPossible(int N) {
        if (N == 0) {
            return 5 * 10;
        }
        int negative = N / Math.abs(N);

        N = Math.abs(N);
        int n = N;
        int maxVal = Integer.MIN_VALUE;
        int counter = 0;
        int position = 1;

        while (n > 0) {
            counter++;
            n = n / 10;
        }
        for (int i = 0; i <= counter; i++) {
            int newVal = ((N / position) * (position * 10)) + (5 * position) + (N % position);

            // if new value is greater the maxVal
            if (newVal * negative > maxVal) {
                maxVal = newVal * negative;
            }

            position = position * 10;
        }
        return maxVal;
    }
    
    // Return the Palindrome String by replacing ?.
    public String solution(String S) {
        if (S == null || S.indexOf('?') == -1) {
            return S;
        }
        StringBuilder sb = new StringBuilder("");
        char prev = '\0';
        int count = 1;
        for (int i = 0; i < S.length(); i++) {
            char current = S.charAt(i);
            if (current == '?' && i < S.length() / 2) {
                current = S.charAt(S.length() - 1 - i);

            } else if (current == '?' && i >= S.length() / 2) {
                current = S.charAt(S.length() / 2 - count);
                count++;
            }
            sb.append(current);
            prev = current;
        }
        System.out.println("oo   " + sb.toString() + " " + sb.toString().replace('?', 'a'));

        for (int i = 0; i < sb.toString().length() / 2; i++) {
            if (sb.toString().charAt(i) != sb.toString().charAt(sb.toString().length() - 1 - i))
                break;
            if (i == sb.toString().length() / 2 - 1)
                return sb.toString();

        }
        return "NO";
    }

    public static void main(String[] args) {
        SmallestPositiveInteger smallestPositiveInteger = new SmallestPositiveInteger();
        int A[] = {1, 3, 6, 4, 1, 2};
        System.out.println(smallestPositiveInteger.solution(A));
        System.out.println(smallestPositiveInteger.solution("ab?ac?"));
        System.out.println(smallestPositiveInteger.MaximumPossible(-999));
    }
}
