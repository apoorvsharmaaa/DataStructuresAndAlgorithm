package com.company;
import java.util.Scanner ;
public class table {
    public static void main(String[] args) {
        System.out.println("ENTER A NUMBER");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i;
        int v =0;
        for (i = 0; i <= 10; i++) {
            v = (a * i);
            System.out.println(v);
//            System.out.println(+a +"*"+i+"="+v);
        }
    }
}
//}
//    int n = 5;
//        for (int i=10;i>=1;i--){
//                int m =n*i;
////            System.out.println(m);
//                System.out.println(n +"x" +i +"="+m);
//                }
//                }
//                }