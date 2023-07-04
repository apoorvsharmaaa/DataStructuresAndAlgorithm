package Leetcode.JavaBasic;

public class DecrementLoop {
    public static void main(String[] args) {
        System.out.println("DECREMENT");
        int n = 0;
        for(int i = 100;i>n;i--){
            i = i-1;
            System.out.println(i);
        }
    }
}
