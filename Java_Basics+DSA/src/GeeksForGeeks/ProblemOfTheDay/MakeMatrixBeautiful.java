package GeeksForGeeks.ProblemOfTheDay;

public class MakeMatrixBeautiful {
    public static void main(String[] args) {
      int  N = 2;
       int  matrix[][] = {{1, 2},
            {3, 4}};
        System.out.println(findMinOperation(N,matrix));
    }
    public static int findMinOperation(int N, int[][] matrix) {
        // code here
        int[] arr = new int[N * N];
        int sum = 0, maxRowSum=0, maxColSum=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sum += matrix[i][j];
            }
        }
        for(int i=0; i<N; i++){
            int currSumRow=0, currSumCol=0;
            for(int j=0; j<N; j++){
                currSumRow += matrix[i][j];
            }
            maxRowSum = Math.max(currSumRow, maxRowSum);
            for(int j=0; j<N; j++){
                currSumCol += matrix[j][i];    //00  10  20
            }
            maxColSum = Math.max(maxColSum, currSumCol);
        }
        int finalMax = Math.max(maxColSum ,maxRowSum);
        int ans = finalMax*N - sum;
        return ans;
    }

}
