package Leetcode.JavaBasic;
import java.util.Scanner;

public class DrivingAligibility {
    public static void main(String[] args) {
        System.out.println("ELIGIBILITY FOR DRIVING");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        if(age>=18) {
            System.out.println("yes! you are eligibile for driving");
        }
        else {
            System.out.println("You are not eligible");
        }
    }
}
