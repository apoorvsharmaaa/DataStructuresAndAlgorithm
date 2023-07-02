package com.company;
import java.util.Scanner;
public class Km_Miles {
    public static void main(String[] args) {
        System.out.println("CONVERT KILOMETER INTO MILES");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Km: ");
        double Km = sc.nextDouble();
        double miles = Km * 0.62137119;
        System.out.println(miles);



    }
}
