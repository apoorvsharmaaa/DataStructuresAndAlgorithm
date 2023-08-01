package Leetcode.JavaBasic;

public class BasicRecursion {
    private static boolean ans(int n) {
        if (n==0){
            return false;
        }
        System.out.println(n);
        ans(n-1);
        return false;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(ans(n));
    }


}
