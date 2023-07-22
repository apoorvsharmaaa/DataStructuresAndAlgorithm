package GeeksForGeeks.Arrays;

public class PrintElementsOfArray {
    public static void main(String[] args) {
        int N=5;
        int arr[] = {1,2,3,4,5};
        printArray(arr,N);
    }
    public static void printArray(int arr[] , int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
