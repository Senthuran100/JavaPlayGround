package com.senthuran;

import java.util.LinkedHashMap;

public class NonRepeatingCharacter {

    public String NonRepeatingCharacter(String word) {
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (!linkedHashMap.containsKey(word.charAt(i))) {
                linkedHashMap.put(word.charAt(i), 1);
            } else {
                linkedHashMap.put(word.charAt(i), linkedHashMap.get(word.charAt(i)) + 1);
            }
        }
        for (Character character : linkedHashMap.keySet()) {
            if (linkedHashMap.get(character) == 1 && character == word.charAt(0)) {
                return "--" + character.toString() + "--";
            } else if (linkedHashMap.get(character) == 1) {
                return character.toString();
            }
        }
        return "No Non Repeating Character";
    }

    public static void main(String[] args) {
        NonRepeatingCharacter nonRepeatingCharacter = new NonRepeatingCharacter();
        System.out.println("Non Repeating Character : " + nonRepeatingCharacter.NonRepeatingCharacter("rtghjbsuii"));
        System.out.println("Non Repeating Character : " + nonRepeatingCharacter.NonRepeatingCharacter("ababcdefcdef"));
        System.out.println("Non Repeating Character : " + nonRepeatingCharacter.NonRepeatingCharacter("ddstreefst"));
    }
}
