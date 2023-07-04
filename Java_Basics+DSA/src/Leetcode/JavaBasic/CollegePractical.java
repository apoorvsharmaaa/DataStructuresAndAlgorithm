package Leetcode.JavaBasic;
//import java.util.Scanner;

public class CollegePractical {
    public static void main(String[] args) {
        int b[] = {56,23,89,69,78};
       int sum = 0;
       int percentage = 0;
        for(int a:b){
            sum = sum+a;
            percentage= sum/b.length;
        }

        System.out.println(percentage);


    }
}
