package com.company2;

public class Leetcode2469 {
    public static void main(String[] args) {
        double celsius = 36.50;
        System.out.println( convertTemperature(celsius));
    }

    private static double[] convertTemperature(double celsius) {
        double t[] = {( celsius + 273.15) ,( celsius*1.80+32.00)};
        return t;
    }
}
