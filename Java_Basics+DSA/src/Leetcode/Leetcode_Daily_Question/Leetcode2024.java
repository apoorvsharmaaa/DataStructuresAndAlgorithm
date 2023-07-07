package Leetcode.Leetcode_Daily_Question;

import java.util.HashMap;

public class Leetcode2024 {
    public static void main(String[] args) {
       String answerKey = "TTFF";
       int k = 2;
        System.out.println(maxConsecutiveAnswers(answerKey,k));
    }

    private static int maxConsecutiveAnswers(String answerKey, int k) {
        int maxSize = 0;
        HashMap<Character, Integer> count = new HashMap<>();

        for (int right = 0; right < answerKey.length(); right++) {
            count.put(answerKey.charAt(right), count.getOrDefault(answerKey.charAt(right), 0) + 1);
            int minor = Math.min(count.getOrDefault('T', 0), count.getOrDefault('F', 0));

            if (minor <= k) {
                maxSize++;
            } else {
                count.put(answerKey.charAt(right - maxSize), count.get(answerKey.charAt(right - maxSize)) - 1);
            }
        }

        return maxSize;
    }
}
