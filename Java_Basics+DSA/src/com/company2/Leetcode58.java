package com.company2;

public class Leetcode58 {
    public static void main(String[] args) {
        String s = "hi my  name is apoorv";
        int i = 0;
        int flag = 1;
        s = s.trim();

        for (i = s.lastIndexOf(" ") + 1; i < s.length() - 1; i++) {
            flag++;
        }
        System.out.println(flag);
    }
}
