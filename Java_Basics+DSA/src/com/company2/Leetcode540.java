package com.company2;

import java.util.HashSet;
import java.util.logging.Handler;

public class Leetcode540 {
    public static void main(String[] args) {
        int nums[] = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }

    private static int singleNonDuplicate(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for (int i:nums){
            if (set.contains(i)){
                set.remove(i);
            }else {
                set.add(i);
            }

        }
        return set.iterator().next();
    }
}
