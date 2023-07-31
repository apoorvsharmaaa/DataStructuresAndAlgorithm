package GeeksForGeeks.Arrays;

import java.util.Arrays;

public class MaxMin2 {
    public static void main(String[] args) {
        int n = 4;
        int a[] = {1,5,3,-5,-4,2,9};
        System.out.println(a);
    }
    public static int ab(int a[] , int n){
        Arrays.sort(a);
        int sum = a[0] + a[n-1];
        return sum;
    }
}
