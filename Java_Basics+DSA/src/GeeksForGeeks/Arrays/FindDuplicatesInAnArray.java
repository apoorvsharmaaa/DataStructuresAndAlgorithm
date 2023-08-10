package GeeksForGeeks.Arrays;

import java.util.*;

public class FindDuplicatesInAnArray {
    public static void main(String[] args) {
        int n=4;
        int a[] = {0,3,1,2};
        System.out.println(duplicates(a,n));
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> a = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(!s.contains(arr[i])){
                s.add(arr[i]);
            }
            else
                a.add(arr[i]);
        }
        if(a.isEmpty()) a.add(-1);
        for(int i : a){
            list.add(i);
        }
        Collections.sort(list);
        return list;
    }
}
