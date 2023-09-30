package Leetcode.DSA_Leetcode;

public class ArrayAnReverse {
    public static void main(String[] args) {
        int [] arr = {4,5,9,1,2,8};
        System.out.println(arr.length);
        reverse(arr);
//        System.out.println(Arrays.toString(arr));      //Sahi hai
    }
    static void reverse(int[] arr) {

        int c = Math.floorDiv(6, 2);
        int temp;
        for (int i = 0; i < 3; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];

            arr[arr.length - i - 1] = temp;
        }
        for (int elements : arr) {
            System.out.print(elements + " ");
        }
    }
}
