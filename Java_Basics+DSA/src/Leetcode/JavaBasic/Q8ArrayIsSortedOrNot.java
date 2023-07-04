package Leetcode.JavaBasic;

public class Q8ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int a[]={45,12,46,468,4613,8479,0,3,468};
        boolean isSorted = true;
        for (int i=0;i<a.length;i++){
            if (a[i]>a[i+1]){
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
