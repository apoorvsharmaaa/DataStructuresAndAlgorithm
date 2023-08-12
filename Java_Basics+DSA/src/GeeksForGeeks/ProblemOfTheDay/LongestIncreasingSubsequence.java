package GeeksForGeeks.ProblemOfTheDay;

import java.util.ArrayList;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int N = 16;
       int [] A = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
        System.out.println(longestSubsequence(N,A));
    }
    static int longestSubsequence(int size, int a[])
    {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(a[0]);
        for(int i=1;i<size;i++){
            if(ans.get(ans.size()-1)<a[i]){
                ans.add(a[i]);
            }else{
                int c=getAns(ans,a[i]);
                ans.set(c,a[i]);
            }
        }
        return ans.size();
    }
    static int getAns(ArrayList<Integer>a,int x){
        int low=0,high=a.size()-1;
        int res=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a.get(mid)==x){
                return mid;
            }else if(a.get(mid)<x){
                low=mid+1;
            }else{
                high=mid-1;
                res=mid;
            }
        }
        return res;
    }
}
