package Leetcode.JavaBasic;
public class MethodQ1MultiplicationOfNumber {
     static void multiplicaton(int n){
        int s;
        for (int i =1; i<=10 ; i++){
            s = n * i;
//            System.out.println(s);
            System.out.println( n + "x" + i + "=" + n*i);
//            return s;
        }
    }

    public static void main(String[] args) {
        multiplicaton(5);
    }
}
