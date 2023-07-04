package Leetcode.DSA_Leetcode;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {45,3,6,5,2,1,8,9,7,10};
        int target = 5;
        System.out.println(linearSearch(arr,target,7,2));

    }
    static int linearSearch(int[] arr, int target , int end , int start) {
        if (arr.length == 0){
            return -1;
        }
        for (int index =start;index< end;index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
