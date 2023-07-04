package Leetcode.DSA_Leetcode;

public class Leetcode2413 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(smallestEvenMultiple(n));
    }

    private static int smallestEvenMultiple(int n) {
        if (n%2==0){
            return n;
        }else {
            return n*2;
        }
    }
}
