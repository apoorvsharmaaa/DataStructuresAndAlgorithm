package com.company2;

public class LinearSearchQuestion1 {
    public static void main(String[] args) {
        int []arr = {45,36,21,50,9,84,23,30};
        int target = 50 ;
        int ans = linearSearch(arr,target);
        System.out.println(ans);

    }
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0){
            return -1;
        }
        for (int index =0;index< arr.length;index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}

//        for (int i = 0 ; i<arr.length;i++){
//            if (arr[i]==7){
//                System.out.println("present");
//            }
//            else {
//                System.out.println("nahi hai");
//            }
//        }
//        System.out.println("present");
//        System.out.println(arr.);
//    }
//}
