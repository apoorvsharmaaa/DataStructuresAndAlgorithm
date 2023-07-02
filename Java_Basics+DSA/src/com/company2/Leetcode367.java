package com.company2;

public class Leetcode367 {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }

    private static boolean isPerfectSquare(int num) {
        if(num ==1){
            return true;
        }
        for (int i = 0;i<100000;i++){
            if (i*i == num){
                return true;
            }
        }
        return false;
    }
}
