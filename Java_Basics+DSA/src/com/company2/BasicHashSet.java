package com.company2;

import java.util.HashSet;
import java.util.Iterator;

public class BasicHashSet {
    public static void main(String[] args) {

//        CREATING
        HashSet<Integer>set = new HashSet<>();

//        INSERT
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //        size
        System.out.println("Size of list: "+ set.size());

//        sab kuch print
        System.out.println(set);

//        ITERATOR
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

//        CONTAINS
        if (set.contains(1)){
            System.out.println("set contains 1");
        }
        if (!set.contains(6)){
            System.out.println("Does not contain 6");
        }

//        DELETE/REMOVE
        set.remove(1);
        if (!set.contains(1)){
            System.out.println("does not contain 1 we deleted it");
        }

//        size
        System.out.println("Size of list: "+ set.size());
     }
}
