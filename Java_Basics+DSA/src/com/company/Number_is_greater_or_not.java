package com.company;
import java.util.Scanner;

public class Number_is_greater_or_not {
    public static void main(String[] args) {
        int b = 50;
        System.out.println("Enter a number:" );
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>=b);

    }
}
