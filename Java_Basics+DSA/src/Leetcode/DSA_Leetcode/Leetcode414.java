package Leetcode.DSA_Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Leetcode414 {
    public static void main(String[] args) {
        int nums[] = {3, 2, 1};
        System.out.println(thirdMax(nums));
    }

    private static int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        if (list.size() < 3) {

            return list.get(list.size() - 1);
        }


            return list.get(list.size() - 3);
        }
    }

