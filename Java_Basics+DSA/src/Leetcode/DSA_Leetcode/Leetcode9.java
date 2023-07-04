package Leetcode.DSA_Leetcode;

public class Leetcode9 {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int i = 0;
        int j = s.length() - 1;
        while (i <= j)
        {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}