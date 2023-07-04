package Leetcode.DSA_Leetcode;

public class Leetcode70 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbStairs(n));
    }

    private static int climbStairs(int n) {
        if (n==1){
            return 1;
        } else if (n==2) {
            return 2;
        }else {
            int []arr = new int[n];
            arr[0] = 1;
            arr[1]=2;
            for (int i=2;i<n;i++){
                arr[i] = arr[i-1]+arr[i-2];
            }
            return arr[n-1];
        }

    }
}
