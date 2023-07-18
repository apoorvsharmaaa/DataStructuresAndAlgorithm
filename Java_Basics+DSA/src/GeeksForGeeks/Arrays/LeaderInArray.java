package GeeksForGeeks.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderInArray {
    public static void main(String[] args) {
        int n = 6;
        int a[] = {16,17,4,3,5,2};
        System.out.println(leaders(a,n));
    }
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> a = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = n-1;i>=0;i--){
            if(arr[i]>=max){
                a.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(a);

        return a;
    }
}