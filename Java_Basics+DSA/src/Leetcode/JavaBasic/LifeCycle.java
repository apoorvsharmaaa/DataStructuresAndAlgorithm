package Leetcode.JavaBasic;
import java.util.Scanner;
public class LifeCycle {
    public static void main(String[] args) {
        System.out.println("LIFE KI CYCLE");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int a = sc.nextInt();
        switch (a){
            case 4:
                System.out.println("School Life Starts");
                break;
            case 17:
                System.out.println("School Khatam College Life Starts");
                break;
            case 18:
                System.out.println("Adult Hogya Licence Bnwale");
                break;
            case 24:
                System.out.println("Job kro");
                break;
            case 28:
                System.out.println("Shadi kro bacche karo");
                break;
            case 69:
                System.out.println("Itna Ghisne Ke baad Budapa Enjoy Kro");
                break;
            case 80:
                System.out.println("Marne ka intejar kro");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
    }

}
