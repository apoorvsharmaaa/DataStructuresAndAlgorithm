package GeeksForGeeks.ProblemOfTheDay;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumMultiplicationToReachEnd {
    public static void main(String[] args) {
        int arr[] = {2, 5, 7};
        int start = 3, end = 30;
        System.out.println(minimumMultiplications(arr,start,end));

    }

    public static int minimumMultiplications(int[] arr, int start, int end) {

        if (start == end) return 0;

        int[] visited = new int[100000];
        Arrays.fill(visited, -1);

        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = 0;

        while (!q.isEmpty()) {
            int temp = q.poll();
            int currentSteps = visited[temp];

            for (int num : arr) {
                int newStart = (temp * num) % 100000;

                if (newStart == end) return currentSteps + 1;
                if (visited[newStart] == -1) {
                    q.offer(newStart);
                    visited[newStart] = currentSteps + 1;
                }
            }
        }

        return -1;
    }
}