package GeeksForGeeks.ProblemOfTheDay;

public class FindKthElementOfSpiralMatrix {
    public static void main(String[] args) {
       int n = 4, m = 4, k = 10;
        int A[][] = {{1 , 2 , 3,  4},
            {5  ,6  ,7  ,8},
            {9  ,10, 11, 12},
            {13 ,14 ,15 ,16}};
        System.out.println(findK(A,n,m,k));
    }
    public static void help(int arr[][], int i, int j, int m, int n, int ans[],int t){
        if (i >= m || j >= n) {
            return;
        }

        for (int p = i; p < n; p++) {
            ans[t]=arr[i][p];
            t++;
        }

        for (int p = i + 1; p < m; p++) {
            ans[t]=arr[p][n - 1];
            t++;
        }

        if ((m - 1) != i) {
            for (int p = n - 2; p >= j; p--) {
                ans[t]=arr[m - 1][p];
                t++;
            }
        }

        if ((n - 1) != j) {
            for (int p = m - 2; p > i; p--) {
                ans[t]=arr[p][j];
                t++;
            }
        }
        help(arr, i + 1, j + 1, m - 1, n - 1,ans,t);
    }
    public static int findK(int A[][], int n, int m, int k)
    { int[] ans=new int[n*m];
        help(A,0,0,n,m,ans,0);
        return ans[k-1];
    }
}
