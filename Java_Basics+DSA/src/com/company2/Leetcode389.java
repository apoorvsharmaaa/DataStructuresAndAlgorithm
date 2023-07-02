package com.company2;

import java.util.Arrays;
import java.util.HashSet;

public class Leetcode389 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));
    }

    static char findTheDifference(String s, String t) {
        int i=0,j=0;
        char tempArray[] = s.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        s= new String(tempArray);


        char tempArray1[] = t.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray1);

        // Returning new sorted string
        t= new String(tempArray1);


        while(i<s.length() && j<t.length()){
            if(s.charAt(i)!=t.charAt(j)) return t.charAt(j);
            else{
                i++;
                j++;
            }
        }

        return t.charAt(j);
    }
}

