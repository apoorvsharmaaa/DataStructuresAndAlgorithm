package Leetcode.Leetcode_Daily_Question;

public class Leetcode5 {
    public static void main(String[] args) {


        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
        public static String longestPalindrome(String s) {
            for (int length = s.length(); length > 0; length--) {
                for (int start = 0; start <= s.length() - length; start++) {
                    if (check(start, start + length, s)) {
                        return s.substring(start, start + length);
                    }
                }
            }

            return "";
        }

        private static boolean check(int i, int j, String s) {
            int left = i;
            int right = j - 1;

            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }

                left++;
                right--;
            }

            return true;
        }
    }

