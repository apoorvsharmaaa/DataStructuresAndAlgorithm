package com.company2;

public class Leetcode1523 {
    public static void main(String[] args) {
        int low = 3;
        int high = 7;
        System.out.println(countOdds(low, high));
    }
    static int countOdds(int low, int high) {
        int total = (high-low)+1;
        if (total%2==0){
            return total/2;
        }
        else {
            if (low%2!=0){
                return total/2+1;
            }
            else {
                return total/2;
            }
        }
    }
}
