package Leetcode.top_interview_150;

import java.sql.Array;

public class Leetcode167 {
    public static void main(String[] args) {
        int numbers[] = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(numbers, target));
    } public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (true) {
            if (numbers[i] + numbers[j]== target){
                return new int[]{++i, ++j};
            }
            if (numbers[i] + numbers[j] < target) {
                i++;
            }
            if (numbers[i] + numbers[j] > target) {
                j--;
            }
        }
    }
}