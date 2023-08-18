package GeeksForGeeks.ProblemOfTheDay;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int n = 6;
        int a[] = {16, 17, 4, 3, 5, 2};
        System.out.println(leaders(a, n));
    }

    static ArrayList<Integer> leaders(int arr[], int n) {
        // Your code here
        ArrayList<Integer> p = new ArrayList<>();
        int max = arr[n-1];
        p.add(max);
        for (int i=n-2;i>=0;i--){
            if (max<=arr[i]){
                p.add(arr[i]);
                max = arr[i];
            }

        }
        Collections.reverse(p);
        return p;
    }
}