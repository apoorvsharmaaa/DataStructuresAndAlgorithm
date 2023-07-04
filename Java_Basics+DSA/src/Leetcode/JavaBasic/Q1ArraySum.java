package Leetcode.JavaBasic;

public class Q1ArraySum {
    public static void main(String[] args) {

        float a[] = {4.5f,5.1f,6.0f,9f,2.56f };
        float sum = 0;
        for (float elements : a){
            sum = sum + elements;
        }
        System.out.println(sum);




//        Scanner sc = new Scanner(System.in);
//        int a[]= new int[5];
//        for (int i = 0; i<a.length;i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i<a.length;i++){
//            System.out.print(a[i] + " ");
//        }
    }
}
