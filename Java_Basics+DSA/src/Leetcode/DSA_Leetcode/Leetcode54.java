package Leetcode.DSA_Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode54 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(spiralOrder(matrix));
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int l = matrix.length;
        for (int i=0;i<l;i++){
            for (int j = i;j<l;j++) {
                list.add(matrix[i][j]);
            }

        }
        return list;

    }
}