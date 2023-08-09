package Leetcode.Leetcode_Daily_Question;

import java.util.Arrays;

public class Leetcode2616 {
    public static void main(String[] args) {
       int [] nums = {10,1,2,7,1,3};
       int p = 2;
        System.out.println(minimizeMax(nums,p));
    }
    public static int minimizeMax(int[] A, int p){
        int n = A.length;
        Arrays.sort(A);
        int l = 0;
        int r = A[n-1]-A[0];
        int mid;
        while(l<r){
            mid = (l+r)/2;
            if(helper(A, mid, p)>=p) r = mid;
            else l = mid +1;
        }
        return l;
    }

    public static int helper(int [] A, int diff, int p){
        int i = 1; int count = 0;
        while(i<A.length){
            if(A[i]-A[i-1]<=diff){
                i++;
                count++;
            }
            i++;
        }
        return count;
    }
}