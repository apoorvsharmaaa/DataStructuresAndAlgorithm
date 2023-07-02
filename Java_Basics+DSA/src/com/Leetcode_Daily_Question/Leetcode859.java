package com.Leetcode_Daily_Question;

import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Leetcode859 {
    public static void main(String[] args) {
        String s = "aa";
        String goal = "aa";
        System.out.println(buddyStrings(s, goal));
    }

    private static boolean buddyStrings(String s, String goal) {
        int l1 = s.length();
        int l2 = goal.length();
        if (l1 != l2) return false;
        if (s.equals(goal)) {
            HashSet<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
                if (set.contains(c))
                    return true;
                set.add(c);
            }
            return false;
        } else {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    list.add(i);
                }
            }
            return list.size() == 2 && s.charAt(list.get(0)) == goal.charAt(list.get(1)) && s.charAt(list.get(1)) == goal.charAt(list.get(0));
        }
    }
}


