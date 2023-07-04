package Leetcode.Leetcode_Daily_Question;

import java.util.HashSet;

public class Leetcode137 {
    public static void main(String[] args) {
        int[] nums ={0,1,0,1,0,1,99};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();
        for(int num:nums){
            if(A.contains(num)){
                A.remove(num);
            }
            else if(B.contains(num)){
                B.remove(num);
                A.add(num);
            }
            else{
                B.add(num);
            }
        }
        return B.iterator().next();
    }
}
