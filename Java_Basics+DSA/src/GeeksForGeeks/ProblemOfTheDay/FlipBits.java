package GeeksForGeeks.ProblemOfTheDay;

public class FlipBits {
    public static void main(String[] args) {
        int N = 5;
       int A[] = {1, 0, 0, 1, 0};
        System.out.println(maxOnes( A,N));
    }
    public static int maxOnes(int a[], int n) {
        int c = 0;
        int c2 = 0;
        int max = Integer.MIN_VALUE;
        for (int i:a){
            if (c<0){
                c=0;
            } else if (i==1) {
                c2=c2+1;
                c=c-1;
            } else if (i==0) {
                c=c+1;
            }
            max = Math.max(c,max);
        }
        if (max<0){
            return c2;
        }else{
            return max+c2;

        }
    }
}
