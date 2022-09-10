package com.senthuran;

import java.util.Stack;

public class ValidParentheis {
    public static boolean isValid(String word) {
        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '{' || word.charAt(i) == '[' || word.charAt(i) == '(') {
                characterStack.push(word.charAt(i));
                continue;
            }
            if (characterStack.isEmpty()) {
                return false;
            }
            char c;
            if (word.charAt(i) == '}') {
                c = characterStack.pop();
                if (c != '{') return false;
            }
            if (word.charAt(i) == ']') {
                c = characterStack.pop();
                if (c != '[') return false;
            }
            if (word.charAt(i) == ')') {
                c = characterStack.pop();
                if (c != '(') return false;
            }
        }

        return characterStack.isEmpty();
    }

    public static void main(String[] args) {
        String word = "()[]{}";
        System.out.println("Valid Parentesis " + isValid(word));
    }
}
