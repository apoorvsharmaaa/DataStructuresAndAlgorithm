package Leetcode.JavaBasic;

public class FibonacciSeriesMethod {
    static void fib(int n) {
        int a = 0;
        int b = 1;
        int c;
        int count = 0;
//        int t = 10;
//        System.out.print(a + " " + b);
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
       fib(10);
        }
    }

