package GeeksForGeeks.ProblemOfTheDay;

public class LargestNumberPossible {
    public static void main(String[] args) {
        int N = 2, S = 9;
        System.out.println(findLargest(N, S));

    }

    static String findLargest(int N, int S) {
        int big = Math.max(N, S);

        int currNum = 0;

        int i = 10;

        while (true) {
            currNum = i;

            int currSum = 0;

            while (currNum > 0) {
                int lastD = currNum % 10;

                currSum += lastD;

                currNum /= 10;
            }

            if (currSum == big) {
                StringBuilder input1 = new StringBuilder();

                input1.append(i);
                input1.reverse();

                return input1.toString();

                // return Integer.toString(i);
            } else {
                i = i + 1;
            }
        }
    }
}
