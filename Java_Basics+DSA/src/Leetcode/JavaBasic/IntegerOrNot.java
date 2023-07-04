package Leetcode.JavaBasic;
import java.util.Scanner;
public class IntegerOrNot {
    public static void main(String[] args) {
        System.out.println("Input a value: ");
        Scanner sc = new Scanner(System.in);
        boolean b = sc.hasNextInt();
        System.out.println(b);
    }
}
