package Leetcode.DSA_Leetcode;

public class ArrayMinElements {
    public static void main(String[] args) {
        int []arr = {78,9,65,12,8,4,5,6,3,69,1};
        int n = arr.length;
        System.out.println(findSum(arr,n));

    }
    public static int findSum(int A[],int N) {
        int c=0;
        for(int a:A){
            if(c<a){
                c = a;
            }
        }
        int d = A[0];
        for (int i =0;i<N;i++){
            if (d>A[i]){
                d = A[i];
            }
        }
        return  d+c;
    }
};

//    static int minimum(int arr[]){
//int c = arr[0];
//        for (int i =0;i<arr.length;i++){
//        if (c>arr[i]){
//            c = arr[i];
//        }
//    }
//       return c;

//    }
//}
