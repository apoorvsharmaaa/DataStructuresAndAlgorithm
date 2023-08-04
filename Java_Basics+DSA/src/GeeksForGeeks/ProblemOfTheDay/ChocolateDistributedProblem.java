package GeeksForGeeks.ProblemOfTheDay;

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistributedProblem {
    public static void main(String[] args) {;
       int N = 8, M = 5 ;
        ArrayList<Integer> a = new ArrayList<>();
//        System.out.println(findMinDiff());

    }

    public static long findMinDiff(ArrayList<Integer> a, int n, int m) {
        // your code here
        Collections.sort(a);
        long min = Integer.MAX_VALUE;
        int j = 0;
        for (int i = m - 1; i < n; i++) {
            min = Math.min(min, a.get(i) - a.get(j));
            j++;
        }
        return min;
    }
}
