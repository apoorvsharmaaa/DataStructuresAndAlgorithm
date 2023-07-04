package Leetcode.top_interview_150;

import java.util.Arrays;

public class Leetcode88 {
    public static void main(String[] args) {
        int[] nums1 ={1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
    }
    static void merge(int[] nums1,int m,  int[] nums2, int n) {
        int a1 = m;
        int b1 = n;
        int c1 = a1 + b1;
        int[] c = new int[c1];
        for (int i = 0; i < a1; i = i + 1) {
            c[i] = nums1[i];
        }
        for (int i = 0; i < b1; i = i + 1) {
            c[a1 + i] = nums2[i];
        }
        for (int i = 0; i < c1; i = i + 1) {

        }
//        System.out.println(Arrays.toString(c));
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - i - 1; j++) {
                if (c[j] > c[j + 1]) {
                    int temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;

                }

            }
        }
        for (int elements : c) {
        }
        System.out.println(Arrays.toString(c));

    }
}
