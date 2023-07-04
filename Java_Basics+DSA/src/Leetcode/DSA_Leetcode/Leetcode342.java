package Leetcode.DSA_Leetcode;

public class Leetcode342 {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }
    static  boolean isPowerOfFour(int n) {
        for(int i=0;i<n;i++){
            double temp = Math.pow(4,i);
            if(temp==n)return true;
            if(temp>n)return false;
        }return false;
    }
}