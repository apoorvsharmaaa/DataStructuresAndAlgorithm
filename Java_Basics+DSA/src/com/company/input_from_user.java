//SUM OF 2 NUMBERS
 package com.company;
import java.util.Scanner;
public class input_from_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1: ");
        int a = sc.nextInt();
        System.out.println("Enter a number2: ");
        int b = sc.nextInt();
        System.out.println("Sum of two number is: ");
        int sum = a + b;
        System.out.println(sum);


    }
}
