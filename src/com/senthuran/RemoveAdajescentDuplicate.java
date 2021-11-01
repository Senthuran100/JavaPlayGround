package com.senthuran;

import java.util.ArrayList;
import java.util.List;

public class RemoveAdajescentDuplicate {
    public static boolean checkAdajescentDuplicate(List<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                return true;
            }
        }
        return false;
    }

    public static void removeDuplicate(String S) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                list.add(Character.toString(S.charAt(i)));
                if (i == S.length() - 2) {
                    list.add(Character.toString(S.charAt(i + 1)));
                }
            } else {
                i++;
            }
        }
        if (checkAdajescentDuplicate(list)) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < list.size() - 1) {
                sb.append(list.get(i));
                i++;
            }
            sb.append(list.get(i));
            String res = sb.toString();
            removeDuplicate(res);
        } else {
            System.out.println(list.toString());
        }
    }

    public static void main(String[] args) {
        String s = "DBAABDAB";
        removeDuplicate("DBAABDAB");
    }
}
