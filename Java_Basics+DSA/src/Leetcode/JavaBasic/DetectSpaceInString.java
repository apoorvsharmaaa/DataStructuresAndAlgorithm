package Leetcode.JavaBasic;

public class DetectSpaceInString {
    public static void main(String[] args) {
        String a = "My name   is apoorv  !";
        System.out.println(a.indexOf("  "));
        System.out.println(a.indexOf("   "));

    }
}
