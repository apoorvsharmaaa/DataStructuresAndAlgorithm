package GeeksForGeeks.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class TwoRepeatedElements {
    public static void main(String[] args) {
        int n = 4;
        int a[] = {1, 2, 1, 3, 4, 3};
        System.out.println(num(a, n));
    }

    public static int[] num(int a[], int n) {
        int b[] = new int[n];
        int v=0;
        HashSet<Integer> s = new HashSet<>();
        for (int i=0;i<a.length;i++){
            if (s.contains(a[i])){
                b[v] = a[i];
                v++;

            }
            else{
                s.add(a[i]);
            }
        }
        return b;
    }
}













//        Stack<Integer> stk = new Stack<>();
//        Arrays.sort(a);
//        int b [] = new int[n];
//        int v=0;
//        for (int i=0;i<a.length;i++){
//            if (stk.peek()==a[i]&&!stk.isEmpty()){
//                b[v] = stk.push(a[i]);
//                v++;
//            }
//            else{
//                stk.push(a[i]);
//            }
//        }
//        return b;
//    }
//}
