package com.company2;

public class MergeSort {
   public static void conquer(int arr[], int s ,int mid, int e) {
       int merged[] = new int[e - s + 1];
       int index1 = s;
       int index2 = mid + 1;
       int x = 0;
       while (index1 <= mid && index2 <= e) {
           if (arr[index1] <= arr[index2]) {
               merged[x++] = arr[index1++];
           } else {
               merged[x++] = arr[index2++];
           }
           while (index1 <= mid) {
               merged[x++] = arr[index1++];
           }
           while (index2 <= e) {
               merged[x++] = arr[index2++];
           }
           for (int i = 0, j = s; i < merged.length; i++, j++) {
               arr[j] = merged[i];
           }
       }
   }
    public static void divide(int[]arr,int s,int e){
        if (s>=e){
            return;
        }
        int mid = s+(e-s)/2;
        divide(arr,s,mid);
        divide(arr,mid+1,e);
        conquer(arr,s,mid,e);
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr [] = {2,5,6,3,8,9};
        int n = arr.length;
        divide(arr,0,n-1);
        for (int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
