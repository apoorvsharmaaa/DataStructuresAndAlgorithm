package GeeksForGeeks.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int  N = 5;
        int A[] = {-2, 1, -4, 5, 3};
        System.out.println(findSum(A,N));
    }
    public static int findSum(int A[],int N) {
        int max=A[0];
        for(int i=0;i<N;i++){
            if(max<A[i]){
                max = A[i];
            }
        }
        int min= A[0];
        for (int i =0;i<N;i++){
            if (min>A[i]){
                min= A[i];
            }
        }
        return  min+max;
    }
}

