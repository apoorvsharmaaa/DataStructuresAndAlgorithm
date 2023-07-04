package Leetcode.DSA_Leetcode;

public class Leetcode1342 {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(numberOfSteps(num));
    }

    private static int numberOfSteps(int num) {
        int res = 0;
        while (num > 0){
            if (num%2==0){
                num = num/2;
            }else {
                num=num-1;
            }
            res++;
        }
        return res;
    }
}
