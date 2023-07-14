package GeeksForGeeks.Maths;

import java.util.Arrays;
import java.util.HashSet;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println(abc(arr, n));
    }

    private static int abc(int arr[], int n) {
        int maxInt = -1, secondMax = -1;
        for (int i : arr) {
            if (i > maxInt) {
                secondMax = maxInt;
                maxInt = i;
            } else if (i < maxInt && i > secondMax) {
                secondMax = i;
            }
        }
        return secondMax;
    }
}