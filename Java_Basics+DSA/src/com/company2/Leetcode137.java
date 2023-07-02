package com.company2;

import java.util.HashSet;

public class Leetcode137 {
    public static void main(String[] args) {
        int [] nums = {2,2,3,2};
        System.out.println(singleNumber(nums));
    }
    static int singleNumber(int[] nums) {
        HashSet<Integer> garbage= new HashSet<Integer>();
        HashSet<Integer> set= new HashSet<Integer>();

        for(int num : nums)
            if(garbage.contains(num)){

            } else if( set.contains(num)){
                set.remove(num);
                garbage.add(num);
            } else{
                set.add(num);
            }

        return set.iterator().next();
    }
}
