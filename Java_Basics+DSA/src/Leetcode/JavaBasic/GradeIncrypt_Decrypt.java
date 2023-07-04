package Leetcode.JavaBasic;

public class GradeIncrypt_Decrypt {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char) (grade+8);
        System.out.println(grade);
        grade = (char) (grade-8);
        System.out.println(grade);
    }
}
