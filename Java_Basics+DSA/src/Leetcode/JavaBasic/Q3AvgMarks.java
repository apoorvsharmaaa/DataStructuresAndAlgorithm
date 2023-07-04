package Leetcode.JavaBasic;

public class Q3AvgMarks {
    public static void main(String[] args) {
        float arr[] = {67.6f, 65.7f, 89.5f, 90.05f, 13.6f, 48f};
        float sum = 0;
        float avg = 0;
        for (float elements:arr){
             sum =  sum + elements;
             avg = (sum/arr.length);
        }
        System.out.println(avg);
    }
}
