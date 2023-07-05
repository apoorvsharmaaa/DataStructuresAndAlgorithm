package Leetcode.DSA_Leetcode;

public class Leetcode2652 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(sumOfMultiples(n));
    }
    public static int sumOfMultiples(int n) {
        int c=0;
        for(int i=0;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0){
                c=c+i;
            }
        }
        return c;
    }
}
