package Leetcode.top_interview_150;
import java.util.HashSet;
import java.util.Set;

public class leetcode2729 {
    public static void main(String[] args) {
        int n = 192;
        System.out.println(isFascinating(n));
    }

    public static boolean isFascinating(int n) {
        int a = n * 2;
        int b = n * 3;
        int[] digits = new int[3];
        digits[0] = n;
        digits[1] = a;
        digits[2] = b;


        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0') return false;
            if (!set.contains(sb.charAt(i))) {
                set.add(sb.charAt(i));
            } else return false;
        }
        return set.size() == 9;
    }
}
