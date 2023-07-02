package com.company;

import java.util.Locale;

public class String_basic {
    public static void main(String[] args) {
        String name  = "Apoorv";
        System.out.println(name);
        int b = name.length();
        System.out.println(b);
        String a = name.toLowerCase();
        System.out.println(a);
        String c = name.toUpperCase();
        System.out.println(c);
        String d = name.trim();
        System.out.println(d);
        System.out.println(name.substring(4));
        System.out.println(name.substring(2,6));
        System.out.println(name.replace('o','s'));
        System.out.println(name.replace("po","as"));
        System.out.println(name.startsWith("ap"));
        System.out.println(name.endsWith("orv"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf('p'));
        System.out.println(name.indent(4));
        System.out.println(name.lastIndexOf("oor"));
        System.out.println(name.lastIndexOf("or",4));
        System.out.println(name.equals("Apoorv"));
        System.out.println(name.equalsIgnoreCase("apoorv"));
    }
}
