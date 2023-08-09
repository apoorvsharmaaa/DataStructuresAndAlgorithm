package GeeksForGeeks.ProblemOfTheDay;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n);
    }
    static long largestPrimeFactor(int N) {
        // code here
        long maxPrime = -1;

        while (N % 2 == 0) {
            maxPrime = 2;
            N /= 2;
        }

        for (int i = 3; i <= Math.sqrt(N); i += 2) {
            while (N % i == 0) {
                maxPrime = i;
                N /= i;
            }
        }

        if (N > 2) {
            maxPrime = N;
        }

        return maxPrime;
    }
}
