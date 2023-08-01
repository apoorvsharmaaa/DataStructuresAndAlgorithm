package Leetcode.JavaBasic;

public class SumOfNNaturalNumByRecur {
    public static void main(String[] args) {

        sum(1,5,0);
    }
    public static void sum(int i, int n , int num){
        if (i == n){
            num+=i;
            System.out.println(num);
            return ;
        }
      num+=i;
      sum(i+1,n,num);
    }
}
