package Leetcode.JavaBasic;
import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        System.out.println("INCOME TAX SCHEME");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you salary:  ");
        int salary = sc.nextInt();
        if (salary>=250000 && salary <=500000 ){
            System.out.println("You have to pay 5% tax");
        } else if (salary>=500000 && salary<=1000000) {
            System.out.println("You have to pay 20% tax");
        }
        else if (salary>=1000000){
            System.out.println("You have to pay 30% tax");
        }
    }
}
