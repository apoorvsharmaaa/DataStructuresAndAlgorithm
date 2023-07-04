package Leetcode.DSA_Leetcode;

public class Leetcode258 {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }

    private static int addDigits(int num) {
        int c = 0;
        while (num > 0) {
            c += num % 10;
            num = num / 10;
            if (num == 0 && c > 9) {
                num = c;
                c = 0;
            }
        }
        return c;
    }
}
