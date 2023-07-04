package Leetcode.DSA_Leetcode;

public class MathsQ1 {

    //ODD OR NOT

    public static void main(String[] args) {
        int n = 67;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        return (n&1)==1;
    }
}
