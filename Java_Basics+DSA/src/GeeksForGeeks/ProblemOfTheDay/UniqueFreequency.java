package GeeksForGeeks.ProblemOfTheDay;

import java.util.HashMap;

public class UniqueFreequency {
    public static void main(String[] args) {
        int N = 5;
        int []arr = {1, 1, 2, 5, 5};
        System.out.println(isFrequencyUnique(N,arr));

    }
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        HashMap<Integer, Boolean> uniqueFrequencyMap = new HashMap<>();
        for (int frequency : frequencyMap.values()) {
            if (uniqueFrequencyMap.containsKey(frequency)) {
                return false;
            } else {
                uniqueFrequencyMap.put(frequency, true);
            }
        }

        return true;
    }
}

