package Leetcode.Leetcode_Daily_Question;

import java.util.ArrayList;
import java.util.Collections;

public class Leetcode2553 {
    public static void main(String[] args) {
        int nums []= {13,25,83,77};
        System.out.println(separateDigits(nums));
    }

    private static int[] separateDigits(int[] nums) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i=nums.length-1;i>=0;i--){
            int x=nums[i];
            while (x>0){
                int rem = x%10;
                ar.add(rem);
                x=x/10;
            }
        }
        Collections.reverse(ar);
        int ans[] = new int[ar.size()];
        for (int i=0;i<ar.size();i++){
            ans[i] = ar.get(i);
        }
        return ans;
    }
}
