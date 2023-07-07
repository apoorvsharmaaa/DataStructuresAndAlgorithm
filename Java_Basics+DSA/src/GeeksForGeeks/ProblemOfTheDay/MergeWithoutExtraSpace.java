package GeeksForGeeks.ProblemOfTheDay;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        int n = 4;
        long arr1[] = {1,3,5,7};
        int m = 5;
        long arr2[] = {0, 2, 6, 8, 9};
//        System.out.println(merge(arr1,arr2,n,m));

    }
    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        // code here
        int i=0,j=0,k=n-1;
        while(i<n && k>=0 && j<m)
        {
            if(arr1[i]>arr2[j])
            {
                long temp=arr2[j];
                arr2[j]=arr1[k];
                arr1[k]=temp;
                j++;k--;
            }
            else
                i++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
