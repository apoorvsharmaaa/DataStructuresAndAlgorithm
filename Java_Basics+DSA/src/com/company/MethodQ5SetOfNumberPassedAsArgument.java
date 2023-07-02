package com.company;

public class MethodQ5SetOfNumberPassedAsArgument {
    static float numbers(int ...a){
        float sum=0;
        float avg = 0;
        for (int i = 0; i<a.length;i++){
            sum = sum+a[i];

        }
        avg = sum/a.length;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println(numbers(4,5,6,1,2));
        System.out.println(numbers(45,50,66,3,4,10,56));
    }
}
