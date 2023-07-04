package Leetcode.DSA_Leetcode;

public class Leetcode1588 {
    public static void main(String[] args) {

    }

    private static int sumOddLengthSubarrays(int[] arr) {
        int c=1;
        int t=0;
        while(c<=arr.length){
            for(int i=0;i<=arr.length-c;i++){
                for(int j=i;j<i+c;j++){
                    t=t+arr[j];
                }
            }
            c=c+2;
        }
        return t;
    }
}

