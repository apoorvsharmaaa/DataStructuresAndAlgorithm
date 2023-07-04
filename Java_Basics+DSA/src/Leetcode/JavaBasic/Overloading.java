package Leetcode.JavaBasic;

public class Overloading {
    static void as(){
        System.out.println("Hello");
    }
    static void as(int a){

        System.out.println("Hello "+a);
    }
    static void as(int a, int b ,int c){
        System.out.println("Supreme "+ a+ " is my"+ b + " Name "+ c);
    }

    public static void main(String[] args) {
        as();
        as(45);
        as(07,45,65);
    }
}
