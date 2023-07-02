package com.company2;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Apoorv";
        char target = 'v';
        System.out.println(search(str , target));
//        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str , char target){
        if (str.length()==0){
            return false;
        }
        for (int index = 0; index<str.length();index++){
            if (target == str.charAt(index)){
                return true;
            }
        }
        return false;
    }
}
