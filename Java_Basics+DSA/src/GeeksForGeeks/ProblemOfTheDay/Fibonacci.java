package GeeksForGeeks.ProblemOfTheDay;

public class Fibonacci {
    public static void main(String[] args) {
        int n=7;
        System.out.println(fib(n));
    }
    public static long[] fib(int n){
        long a=1;
        long b=1;
        long c;
        long [] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i]=a;
            c=a+b;
            a=b;
            b=c;

        }
        return arr;
    }
}