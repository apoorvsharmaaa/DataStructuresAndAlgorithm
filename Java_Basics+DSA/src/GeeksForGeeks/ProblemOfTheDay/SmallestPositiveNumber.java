package GeeksForGeeks.ProblemOfTheDay;

import java.util.Arrays;
import java.util.HashSet;

public class SmallestPositiveNumber {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,3,4,5};
        System.out.println(missingNumber(arr,n));
    }
   public static int missingNumber(int arr[], int size){
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int i=1;
        while(i!=-1){
            if(!set.contains(i)){
                return i;
            }
            i++;
        }
        return i;
    }
}

