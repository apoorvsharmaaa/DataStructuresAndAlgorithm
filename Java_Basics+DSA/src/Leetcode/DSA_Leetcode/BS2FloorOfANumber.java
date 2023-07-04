package Leetcode.DSA_Leetcode;

public class BS2FloorOfANumber {
    public static void main(String[] args) {
        int [] arr = {-12,-3,-1,4,5,6,9,45,50,65,99,450};
        int target = 42;
        int ans = binarysearch(arr,target);
        System.out.println(ans);

    }
    static int binarysearch(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;


        while (start <=end){
//            int mid = (start + end)/2;
            int mid = start +(end - start)/2; //same upper wala ki traf ek or formula jo use hota h for long array jab array mai bahut saare elements ho!!!!1

            if (target < arr[mid]){
                end = mid -1;


            } else if (target> arr[mid]) {
                start = mid+1;

            }else {
                return mid;
            }
        }
        return end;
    }
}

