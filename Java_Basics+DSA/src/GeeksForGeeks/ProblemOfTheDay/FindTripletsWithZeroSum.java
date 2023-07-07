package GeeksForGeeks.ProblemOfTheDay;

import java.util.Arrays;

public class FindTripletsWithZeroSum {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {0, -1, 2, -3, 1};
        System.out.println(findTriplets(arr, n));
    }

    public static boolean findTriplets(int arr[], int n) {
        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            int temp = 0-arr[i];
            int j=i+1;
            int k=n-1;
            while (j<k){
                if (arr[j]+arr[k]==temp){
                    return true;
                }
                else if (arr[j]+arr[k]<temp){
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        return false;
    }
}

