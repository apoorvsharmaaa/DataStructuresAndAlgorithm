package com.company;
import java.util.Objects;
import java.util.Scanner;
public class ZodiacSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Birthday Month: ");
        String month = sc.next();
        if(Objects.equals(month, "March")){
            System.out.println("ARIES");
        }
        else if(Objects.equals(month, "April")){
            System.out.println("TAURUS");
        }
        else if(Objects.equals(month, "May")){
                System.out.println("GEMINI");
        }
        else if(Objects.equals(month, "June")){
                System.out.println("CANCER");
        }
        else if(Objects.equals(month, "July")){
            System.out.println("LEO");
        }
        else if(Objects.equals(month, "August")){
            System.out.println("VIRGO");
        }
        else{
            System.out.println("LIBRA");

        }


    }

        }

