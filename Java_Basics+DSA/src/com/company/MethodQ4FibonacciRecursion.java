package com.company;

public class MethodQ4FibonacciRecursion {
    static int fib(int n){
        if (n == 1){
            return 0;
        } else if (n==2) {
            return 1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
//        fib(1);
        int b = fib(8);
        System.out.println(b);
    }
}
