package GeeksForGeeks.ProblemOfTheDay;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharInaStream {
    public static void main(String[] args) {
        String A = "aabc";
        System.out.println(FirstNonRepeating(A));
    }

    private static String FirstNonRepeating(String A) {
        int[] arr=new int[26];;
        Queue<Character> q=new LinkedList<>();
        StringBuilder a=new StringBuilder();
        for(int i=0;i<A.length();i++){
            char c=A.charAt(i);
            if(arr[c-'a']==1){
                q.remove(c);
            }
            else{
                arr[c-'a']=1;
                q.add(c);
            }
            if(q.size()>0){
                a.append(q.peek());
            }
            else{
                a.append("#");
            }
        }
        return a.toString();
    }
}
