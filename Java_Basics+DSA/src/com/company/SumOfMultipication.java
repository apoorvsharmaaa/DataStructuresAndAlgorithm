package com.company;

import java.util.Scanner;

public class SumOfMultipication {
    public static void main(String[] args) {
        System.out.println("ENTER A NUMBER");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i;
        int v = 0;
        for (i = 0; i <= 10; i++) {
            v = v  + (a * i);
        }
        System.out.println("THE SUM OF MULTIPLIACATION IS: ");
        System.out.println(v);

    }
}
