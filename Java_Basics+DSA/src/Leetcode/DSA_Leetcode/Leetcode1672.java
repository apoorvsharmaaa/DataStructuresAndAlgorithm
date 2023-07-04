package Leetcode.DSA_Leetcode;

public class Leetcode1672 {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(arr));

    }
    static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0;person<accounts.length;person++){
            int rowSUM = 0;
            for (int account = 0; account< accounts[person].length;account++){
                rowSUM = rowSUM + accounts[person][account];
            }
//            int max =rowSUM;
            if (rowSUM> ans){
               ans = rowSUM;
//                System.out.println(max);
            }
        }
        return ans;
    }
}