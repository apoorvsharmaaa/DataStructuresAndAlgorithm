package Leetcode.JavaBasic;

public class VarArgs {
    static int sum(int ...a){
        int result = 0;
        for (int b : a){
            result = result+b;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(5,6,7,5,3,1,4));
        System.out.println(sum());
        System.out.println(sum(4,6));
    }
}


