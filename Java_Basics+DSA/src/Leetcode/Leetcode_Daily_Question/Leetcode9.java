package Leetcode.Leetcode_Daily_Question;

public class Leetcode9 {
    public static void main(String[] args) {
        int n=  121;
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int x) {
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

