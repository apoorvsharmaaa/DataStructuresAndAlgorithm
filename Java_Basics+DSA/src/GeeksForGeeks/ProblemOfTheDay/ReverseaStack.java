package GeeksForGeeks.ProblemOfTheDay;

import java.util.Stack;

public class ReverseaStack {
    public static void main(String[] args) {
    }
//        Stack<Integer> s = new Stack<>();
//        for (int i)
//        reverse(s);
        static void insertAtLast (Stack < Integer > s,int val)
        {
            if (s.isEmpty()) {
                s.add(val);
                return;
            }

            int el = s.pop();
            insertAtLast(s, val);
            s.add(el);
        }
        static void reverse (Stack < Integer > s)
        {
            if (s.isEmpty()) return;

            int el = s.pop();

            reverse(s);

            insertAtLast(s, el);
        }
    }