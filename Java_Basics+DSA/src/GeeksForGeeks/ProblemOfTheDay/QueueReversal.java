package GeeksForGeeks.ProblemOfTheDay;

import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public static void main(String[] args) {


    }
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> rev=new Stack<Integer>();
        while(!q.isEmpty()){
            rev.add(q.peek());
            q.remove();
        }
        while(!rev.isEmpty()){
            q.add(rev.pop());
        }
        return q;

    }
}
