package Leetcode.Leetcode_Daily_Question;

public class Leetcode135 {
    public static void main(String[] args) {
        int []ratings = {1,0,2};
        System.out.println(candy(ratings));

    }
        public static int candy(int[] ratings) {
            int ans=ratings.length,n=ratings.length;

            int [] candy=new int[ratings.length];
            for(int i=1;i<ratings.length;i++){
                if(ratings[i]>ratings[i-1]){
                    candy[i] =candy[i-1]+1;
                    ans +=candy[i];
                }
            }

            for(int i=ratings.length-2;i>=0;i--){
                if(ratings[i]>ratings[i+1]){
                    ans-= candy[i];
                    candy[i]=Math.max(candy[i+1]+1,candy[i]);
                    ans+=candy[i];
                }
            }
            return ans;
        }
    }