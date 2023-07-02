package com.company;
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {5, 2, 6, 7, 1, 0, 9, 8};
        for (int i = 0 ; i<a.length-1;i++){
            for (int j = 0;j<a.length-i-1;j++){
                if (a[j]>a[j+1]){
                    int temp = a[j];
                     a[j] = a[j+1];
                     a[j+1] = temp;

                }

            }
        }
        for (int elements:a){
            System.out.print(elements);
            System.out.print(" ");
        }
//        System.out.println(a);
    }
}
