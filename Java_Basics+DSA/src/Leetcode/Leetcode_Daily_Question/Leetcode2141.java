package Leetcode.Leetcode_Daily_Question;

public class Leetcode2141 {
    public static void main(String[] args) {
        int n = 2, batteries[] = {3,3,3};
        System.out.println(ac(n,batteries));
    }

    private static boolean isPossibleToRun(int n, int [] batteries, long avg){
        long duration = 0;
        for (int i: batteries){
            if (i<avg){
                duration = duration+i;
            }
            else {
                duration = duration = avg;
            }
        }
        return duration >= avg*n;
    }

    private static long ac(int n, int[] batteries) {
        long sum = 0;
        for (long i:batteries){
            sum = sum+i;
        }
        long s = 0;
        long e = sum;
        long ans = 0;



        while(s<=e){
            long avg = (s+e)/2;
            if (isPossibleToRun(n,batteries,avg)){
                ans = avg;
                s = avg+1;
            }
            else{
                e = avg-1;
            }
        }
        return ans;
    }
}
