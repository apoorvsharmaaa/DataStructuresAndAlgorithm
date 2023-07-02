package com.company;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int f = 1;
        int i = 0;
        while (i<n){
            f = f*(i+1);
            System.out.println(f);
            i++;




//        for (int i=0;i<=n-1;i++){
//             f = f*(i+1);
//            System.out.println(f);
        }
    }
}
