package GeeksForGeeks.ProblemOfTheDay;

public class NumberOfOccurrence {
    public static void main(String[] args) {
        int n=7;
        int x = 4;
        int arr[] = {1,1,2,2,2,2,3};
        System.out.println(count(arr,n,x));
    }
    public static int count(int[] arr, int n, int x) {
        int c=0;
        for (int i=0;i<n;i++){
            if (arr[i]==x){
                c++;
            }

        }
        return c;
    }
}
