package org.lumijiez.easy;

import java.util.Arrays;

public class E242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagran", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        int[] sChars = new int[128];
        int[] tChars = new int[128];

        for (char c : s.toCharArray()) sChars[c]++;
        for (char c : t.toCharArray()) tChars[c]++;

        return Arrays.equals(sChars, tChars);
    }
}
