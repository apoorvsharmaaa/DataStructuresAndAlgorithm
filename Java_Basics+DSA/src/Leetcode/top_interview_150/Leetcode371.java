package Leetcode.top_interview_150;

public class Leetcode371 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(getSum(a,b));
    }

    private static int getSum(int a, int b) {
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        if (a>=0&&b>=0) {
            for (int i = 0; i < min; i++) {
                max++;
            }
        }
            else{
                for (int i=0;i<Math.abs(min);i++){
                    max--;
                }
            }
            return max;
        }
    }

