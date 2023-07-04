package Leetcode.DSA_Leetcode;

public class MathsQ2 {

    //FIND A NUM WHICH IS APPEARING ONLY OME TIME IN AN ARRAY

    public static void main(String[] args) {
        int arr[] = {2,3,4,2,1,1,3,6,4};
        System.out.println(value(arr));
    }
    static int value(int arr[]){
        int unique = 0;
        for (int n: arr){
            unique ^=n;
        }
        return unique;
    }
}
