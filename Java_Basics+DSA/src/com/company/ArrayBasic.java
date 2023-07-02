package com.company;

public class ArrayBasic {
    public static void main(String[] args) {

////        Using int
//        int[] marks = {43, 54, 6, 7, 9};
//        System.out.println(marks[3]);
//        System.out.println(marks.length);
//
////        using float
//
//        float[] percentage ={43.4f,54.3f,87.4f,66f,90f,03f};
//        System.out.println(percentage[4]);
//
////      Using String
//
//        String[] names = {"apoorv" , "Stuti","ARSHAD","asiS"};
//        System.out.println(names[1]);


        //       displaying the array (for loop)
//        int a[] = {4,5,3,5,2,5,6,7,8,9,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,9,0,45,55,34,42,4,2,466,7,8,8,87};
//        for (int i=0;i< a.length;i++){
//            System.out.println(a[i]);
//        }
//        System.out.println(a.length);


//        displaying array in reverse order

        int as[] = {4,5,6,4,6,2,3,9,5,4,7,8,9,65,63,23,65,6565,65,666232,26,566565,31,1,6,5};
//
//        System.out.println("Length of this array is: "+as.length);
//        System.out.println("elements are as followed");
//                for ( int i = as.length -1;i>=0;i--){
//                    System.out.println(as[i]);


//anathore method and short
        for (int i : as){
            System.out.println(i);
                }
    }
}




