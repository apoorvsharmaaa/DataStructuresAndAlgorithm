package GeeksForGeeks.ProblemOfTheDay;

import java.util.ArrayList;
import java.util.List;

public class Leetcode112 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(generate(n));

    }
    public static List<List<Integer>> generate(int numRows) {
        if(numRows==0){
            return new ArrayList();
        }
        List<List<Integer>>result = new ArrayList();
        for(int i=1;i<=numRows;i++){
            List<Integer> row = new ArrayList();
            for(int j=0;j<i;j++){
                if(j==0||j==i-1){
                    row.add(1);
                }
                else{
                    row.add(result.get(i-2).get(j)+result.get(i-2).get(j-1));
                }
            }
            result.add(row);
        }
        return result;
    }

}
