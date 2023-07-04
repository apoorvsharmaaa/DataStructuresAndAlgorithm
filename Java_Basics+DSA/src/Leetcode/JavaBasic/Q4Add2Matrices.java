package Leetcode.JavaBasic;

public class Q4Add2Matrices {
    public static void main(String[] args) {
        int a[][]={{4,6,7},
                   {8,9,5}};
        int b[][]={{9,5,10},
                   {4,9,2}};
        int c[][]= new int[2][3];
        for (int i =0;i<=a.length; i++){
            for (int j = 0;j<=b.length;j++){
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
