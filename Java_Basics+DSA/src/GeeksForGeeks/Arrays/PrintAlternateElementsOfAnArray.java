package GeeksForGeeks.Arrays;

public class PrintAlternateElementsOfAnArray {
    public static void main(String[] args) {
        int N=4;
        int A[] = {1,2,3,4};
        print(A,N);
    }

    public static void print(int arr[], int n){
                for(int i=0;i<n;i+=2){
                    System.out.print(arr[i]+"");
                }

            }
        }
