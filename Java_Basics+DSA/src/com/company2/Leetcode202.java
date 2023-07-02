package com.company2;

import java.util.HashSet;

public class Leetcode202 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));

    }
    static boolean isHappy(int n) {
        HashSet <Integer> set = new HashSet<>();
        while (n!=1 && !set.contains(n)){
            set.add(n);
            n = getNext(n);
        }
        return n==1;
    }

     static int getNext(int n) {
        int sum = 0;
        while (n>0){
            int a = n%10;
            sum+=a*a;
            n=n/10;
        }
        return sum;
    }
}
