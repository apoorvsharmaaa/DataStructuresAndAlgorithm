package com.company;
import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        System.out.println("CGPA of a student");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Hindi: ");
        double hindi = sc.nextDouble();
        System.out.println("Enter the marks of English: ");
        double english = sc.nextDouble();
        System.out.println("Enter the marks of Maths: ");
        double maths = sc.nextDouble();
        System.out.println("Enter the marks of Science: ");
        double science = sc.nextDouble();
        System.out.println("Enter the marks of CS: ");
        double CS = sc.nextDouble();
        float percentage = (float) (((hindi + english + maths + science + CS)*100f)/500f);
        System.out.println("This is your Percentage "+percentage);
        float cgpa = (float) (percentage/9.5f);
        System.out.println("You got " +cgpa + "cgpa");
    }
}
