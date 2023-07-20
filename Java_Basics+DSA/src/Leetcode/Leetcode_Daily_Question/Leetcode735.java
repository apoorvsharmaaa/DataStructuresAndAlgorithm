package Leetcode.Leetcode_Daily_Question;

import java.util.Stack;

public class Leetcode735 {
    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};
        System.out.println(asteroidCollision(asteroids));
    }

    private static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] < 0) {
                while (!stk.isEmpty() && stk.peek() > 0 && stk.peek() < Math.abs(asteroids[i])) {
                    stk.pop();
                }
                if (!stk.isEmpty() && stk.peek() == Math.abs(asteroids[i])) {
                    stk.pop();
                } else if (stk.isEmpty() || stk.peek() < 0) {
                    stk.push(asteroids[i]);
                }
            } else {
                stk.push(asteroids[i]);
            }
        }

        int n = stk.size();
        int ans[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = stk.pop();
        }
        return ans;
    }
}
