package Leetcode.Leetcode_Daily_Question;

public class Leetcode50 {
    public static void main(String[] args) {
        double x = 2.00000;
        int n =10;
        System.out.println(myPow(x,n));
    }
    public static double myPow(double x, int n){
        double ans = 1.0;
        long pow = n;
        if (n<0){
            pow = -1*pow;
        }
        while (pow>0){
            if (pow%2==1){
                ans = ans*x;
                pow -=1;
            }
            else{
                x=x*x;
                pow = pow/2;
            }
        }
        if (n<0){
            return 1.0/ans;
        }
        else {
            return ans;
        }
    }
}
