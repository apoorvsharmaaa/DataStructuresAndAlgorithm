package com.company2;

import java.util.Arrays;
import java.util.HashMap;

public class Leetcode2418 {
    public static void main(String[] args) {
        String []names = {"Mary","John","Emma"};
       int [] heights = {180,1651,170};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    private static String []sortPeople(String[] names, int[] heights) {
        String[] ans = new String[names.length];
        HashMap<Integer,String>map = new HashMap<>();
        for (int i=0;i< names.length;i++){
            map.put(heights[i],names[i] );
        }
        Arrays.sort(heights);
        int num = 0;
        for (int i= names.length-1;i>=0;i--){
            ans[num] = map.get(heights[i]);
            num++;
        }
        return ans;
    }
}
