package com.company2;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);


//        AGAR USER SE SCANNER LEKE KRWANA HO TOH YEH WALA METHOD.
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0;i<3;i++){
//            list.add(sc.nextInt());
//        }

//         NORMALLY KRNA HAI TOH YEH.
        list.add(45);
        list.add(78);
        list.add(9);
        list.add(457);
        list.add(785);
        list.add(91);

        System.out.println(list);
        System.out.println(list.contains(65));
        list.set(0,8);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
