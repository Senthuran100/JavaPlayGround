package com.senthuran;

public class LengthofLastWord {

    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String lastword = words[words.length - 1];
        return lastword.toCharArray().length;
    }

    public static void main(String[] args) {
        LengthofLastWord lengthofLastWord = new LengthofLastWord();
        String word = "luffy is still joyboy";
        System.out.println(" Length of the last word " + lengthofLastWord.lengthOfLastWord(word));
    }
}
