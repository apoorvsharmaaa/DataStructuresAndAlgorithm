package com.company;

public class BreakExample {
    public static void main(String[] args) {
        int i = 0;
        while (i < 7) {
            System.out.println(i);
            System.out.println("Hello");
            if (i == 3) {
                System.out.println("end");
                break;
            }
            i++;
        }
    }
}
//        for(int i=0;i<=50;i++){
//            System.out.println(i);
//            System.out.println("Hello");
//            if (i==2){
//                System.out.println("END");
//                break;
//            }
//        }
//    }
//}
