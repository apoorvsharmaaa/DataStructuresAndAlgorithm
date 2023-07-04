package Leetcode.DSA_Leetcode;

public class Leetcode1323 {
    public static void main(String[] args) {
        int num = 9669;
        System.out.println(maximum69Number(num));
    }

    public static int maximum69Number(int num) {
        String str = new String(num + "");
        String s1 = str.replaceFirst("[6]", "9");
        return Integer.parseInt(s1);
    }
}
