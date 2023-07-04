package Leetcode.JavaBasic;
import java.util.Scanner;

public class FindOutTheWebsites {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your url:");
        String url = sc.next();
        if (url.endsWith(".com")){
            System.out.println("Commercial Website");
        } else if (url.endsWith(".org")){
            System.out.println("Organization Website");
        }else if (url.endsWith(".in")){
            System.out.println("Its mothefucking Indian Website");
        }
    }
}
