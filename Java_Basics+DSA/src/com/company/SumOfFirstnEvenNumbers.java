package com.company;

public class SumOfFirstnEvenNumbers {
    public static void main(String[] args) {
        int n = 3;
        int sum = 0;

        System.out.println(sum);
        for (int i = 0; i < n; i++) {
            sum = (i * 2) + sum;

        }
        System.out.println("Sum of 1st n Even NUmbers are: ");
        System.out.println(sum);
    }
}


