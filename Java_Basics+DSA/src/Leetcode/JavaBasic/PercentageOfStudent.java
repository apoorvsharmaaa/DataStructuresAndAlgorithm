package Leetcode.JavaBasic;
import java.util.Scanner;
public class PercentageOfStudent {
    public static void main(String[] args) {
        System.out.println("Percentage of a Students");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Hindi: ");
        float hindi = sc.nextFloat();
        System.out.println("Enter marks in English");
        float english = sc.nextFloat();
        System.out.println("Enter marks in Maths");
        float maths = sc.nextFloat();
        System.out.println("Enter marks in Science");
        float science = sc.nextFloat();
        System.out.println("Enter marks in SST");
        float SST = sc.nextFloat();
        float percentage = ((hindi + english + maths + science + SST)*100)/500;
        System.out.println("Your percentage is "+percentage);
    }
}
