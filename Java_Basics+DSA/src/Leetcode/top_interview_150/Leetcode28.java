package Leetcode.top_interview_150;

public class Leetcode28 {
    public static void main(String[] args) {
        String haystack = "sadbusad";
        String needle = "sad";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        int n = needle.length();
        int m=haystack.length();
        if (n>m){
            return -1;
        }
        for (int i=0;i<m;i++){
            if (haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
