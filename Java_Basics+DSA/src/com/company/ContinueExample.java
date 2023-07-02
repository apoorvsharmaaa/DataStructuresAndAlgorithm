package com.company;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i =0;i<50;i++){
            if(i==2){
                System.out.println("Ending of loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Hello");
        }
    }
}
