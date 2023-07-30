package Leetcode.top_interview_150;

import java.util.HashMap;

public class Leetcode290 {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }
    public static boolean wordPattern(String str, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] a = s.split(" ");
        if (a.length!= str.length()){
            return false;
        }
        for (int i = 0; i<str.length();i++){
            char b = str.charAt(i);
            if (!map.isEmpty()&& map.containsKey(b) && !map.get(b).equals(a[i])) return false;

            if (!map.isEmpty()&& map.containsKey(b) && map.get(b).equals(a[i])) continue;

            if(!map.isEmpty() && map.containsValue(a[i]))return false;

            map.put(b,a[i]);
        }
        return true;
    }
}
