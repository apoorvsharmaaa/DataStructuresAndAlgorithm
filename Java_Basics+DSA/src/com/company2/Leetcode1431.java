package com.company2;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1431 {

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static int max(int arr[]) {
        int c = 0;
        for (int elements : arr) {
            if (c < elements) {
                c = elements;
            }

        }
        return c;
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = max(candies);
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= maxCandies);
        }
        return result;
    }
}
