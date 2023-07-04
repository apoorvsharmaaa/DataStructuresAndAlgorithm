package Leetcode.JavaBasic;
import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A YEAR: ");
        int year = sc.nextInt();
        if (year%400==0 && year%100==0){
            System.out.println("Leap year");
        } else if (year%100!=0 && year%4==0) {
            System.out.println("Leap year");

        }else {
            System.out.println("Not a leap year");
        }
    }
}
