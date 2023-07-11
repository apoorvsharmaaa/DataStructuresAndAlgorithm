package Leetcode.top_interview_150;

public class Leetcode09 {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x){
        String s = String.valueOf(x);
        int n = 0;
        int l = s.length()-1;
        while(n<=l){
            if (s.charAt(n)!=s.charAt(l)){
                return false;
            }
            else{
                n++;
                l--;
            }
        }
        return true;
    }
}
