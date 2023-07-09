package GeeksForGeeks.ProblemOfTheDay;

public class TransposeOfMatrix {
    public static void main(String[] args) {
       int N = 4;
       int mat[][] = {{1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}};
        transpose(N,mat);
    }

    public static void transpose(int n, int[][] a) {
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                if (i != j) {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
        }
    }
}
