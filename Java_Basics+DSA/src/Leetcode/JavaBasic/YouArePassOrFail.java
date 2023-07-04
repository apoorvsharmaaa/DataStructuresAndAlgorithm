package Leetcode.JavaBasic;
import java.util.Scanner;
public class YouArePassOrFail {
    public static void main(String[] args) {
        System.out.println("RESULT AAGYA!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks in C/C++: ");
        int c = sc.nextInt();
        System.out.print("Enter your marks in Python: ");
        int python = sc.nextInt();
        System.out.println("Ener your marks in Java: ");
        int java = sc.nextInt();
        int percentage = ((c + python + java)*100)/300;
        System.out.println(percentage);
        if(percentage>=40 && c>=33 && python>=33 && java>=33 ) {
                System.out.println("CONGRATULATIONS! You are pass in exams");
            }
            else{
                    System.out.println("You are fail in exams");
            }
            }
        }
