package Leetcode.JavaBasic;
import java.util.Scanner;

public class Q2IntigerIsPresentInArrayOrNot {
    public static void main(String[] args) {
        int a[] = {45, 4, 5, 4, 9, 6, 1, 3, 5, 89, 5, 23, 9, 52, 615, 5, 5256, 5, 0, 1};
//        System.out.println(a.length);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you wanna search in an array: ");
        int b = sc.nextInt();
        int c = 0;
        for (int element : a) {
            if (b == element){
                c++;
            }

        }
//        System.out.println(c);
        if(c>0){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
