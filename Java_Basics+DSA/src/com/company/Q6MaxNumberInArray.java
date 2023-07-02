package com.company;

public class Q6MaxNumberInArray {
    public static void main(String[] args) {
        int a [] ={45,42,3265,45432,45135,456468132,6546853,415356};
        int c = 0;
        for (int element:a){
            if (element>c){
                c = element;
            }
        }
        System.out.println(c);
    }
}
