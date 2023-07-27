package GeeksForGeeks.ProblemOfTheDay;

public class HeapSort {
    public static void main(String[] args) {
        int N = 5, arr[] = {4, 1, 3, 9, 7};
        buildHeap(arr,N);

    }

    //Function to build a Heap from array.
    static void buildHeap(int arr[], int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    //Heapify function to maintain heap property.
    static void heapify(int arr[], int n, int i) {
        int l = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[l]) {
            l = left;
        }
        if (right < n && arr[right] > arr[l]) {
            l = right;
        }
        if (l != i) {
            int temp = arr[i];
            arr[i] = arr[l];
            arr[l] = temp;
            heapify(arr, n, l);
        }
    }

    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n) {
        buildHeap(arr, n);
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
}
