package Leetcode.Leetcode_Daily_Question;

import java.util.ArrayList;
import java.util.List;

public class Leetcode77 {
    public static void main(String[] args) {
        int n=3;
        int k=2;
        System.out.println(combine(n,k));
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<Integer> comb = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        function(1, k, n, comb, result);

        return result;
    }

    public static void function(int pos, int k, int limit, List<Integer> comb, List<List<Integer>> result){

        if(comb.size() + (limit - pos + 1) < k ) return;

        if(comb.size() == k){
            result.add(new ArrayList<>(comb));
            return;
        }

        for(int i= pos;i<= limit;i++){

            comb.add(i);
            function(i+1, k, limit, comb, result);
            comb.remove(comb.size()-1);
        }
    }
}
