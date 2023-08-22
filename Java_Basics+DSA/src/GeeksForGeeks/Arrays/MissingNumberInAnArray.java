package GeeksForGeeks.Arrays;

import java.util.Arrays;

public class MissingNumberInAnArray {
    public static void main(String[] args) {
        int n = 5;
        int a[] = {1, 2, 3, 5};
        System.out.println(num(a, n));
    }

    public static int num(int a[], int n) {
        int s=n*(n+1)/2;
        for(int i=0;i<n-1;i++){
            s=s-a[i];
        }
        return s;
    }
}