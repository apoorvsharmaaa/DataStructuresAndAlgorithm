package com.company2;

import java.util.ArrayList;

public class Leetcode1281 {
    public static void main(String[] args) {
        int n=234;
        System.out.println(subtractProductAndSum( n));
    }

    private static int subtractProductAndSum(int n) {
        int a;
        int sum=0;
        int product = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        while (n!=0){
            a = n%10;
            n = n/10;
            arr.add(a);

        }
        for (int i=0;i<arr.size();i++){
            sum = sum+ arr.get(i);
            product = product*arr.get(i);
        }
        return product-sum;
    }
}
