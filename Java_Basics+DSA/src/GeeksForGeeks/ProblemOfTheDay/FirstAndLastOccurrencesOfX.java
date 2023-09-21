package GeeksForGeeks.ProblemOfTheDay;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class FirstAndLastOccurrencesOfX {
    public static void main(String[] args) {
        int n = 9, x = 5;
        int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        System.out.println(find(arr, n, x));
    }

     public   static ArrayList<Integer> find(int arr[], int n, int x) {
            // code here
            ArrayList<Integer> list = new ArrayList<>();

            int first = bFirst(arr, n, x);
            int last = bLast(arr, n, x);
            if (first != -1) {
                list.add(first);
            } else {
                list.add(-1);
            }

            if (last != -1) {
                list.add(last);
            } else {
                list.add(-1);
            }
            return list;
        }

      public   static int bFirst(int arr[], int n, int x) {
            int ans = -1;
            int low = 0;
            int high = n - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] >= x) {
                    if (arr[mid] == x) {
                        ans = mid;
                    }
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            if (ans != -1) {
                return ans;
            }
            return -1;
        }

       static int bLast(int arr[], int n, int x) {
            int ans = -1;
            int low = 0;
            int high = n - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] <= x) {
                    if (arr[mid] == x) {
                        ans = mid;
                    }
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            if (ans != -1) {
                return ans;
            }
            return -1;
        }
    }
