package Leetcode.DSA_Leetcode;
import java.util.Arrays;

public class ArraySwapingOfElement {
    static void swap(int a[],int index1,int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static void main(String[] args) {
        int a[] = {4,5,3,6,9,1,2,8};
        swap(a ,0,7);
        System.out.println(Arrays.toString(a));
    }

}
