package Leetcode.DSA_Leetcode;

public class Leetcode410 { //INCOMPLETE ABHI KARNA HAI YEH//.....
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 5;
        int ans = search(nums, k);
        System.out.println(ans);
    }

    static int search(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (k < nums[mid]) {
                end = mid - 1;

            } else if (k > nums[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }
        }
        return -1;
    }
}
