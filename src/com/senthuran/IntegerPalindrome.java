package com.senthuran;

public class IntegerPalindrome {

    public boolean isPalindrome(int x) {
        int num = x;
        int rev = 0;
        int dig = 0;
        if(x<0){
            return false;
        }
        while (x > 0) {
            dig = x % 10;
            rev = rev * 10 + dig;
            x = x / 10;
        }
        if (num == rev)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        IntegerPalindrome integerPalindrome = new IntegerPalindrome();
        int num =12321;
        boolean checkPalindrome = integerPalindrome.isPalindrome(num);
        System.out.println(Integer.toString(num)+" is "+(checkPalindrome?" palindrome ":" not palindrome"));
    }
}
