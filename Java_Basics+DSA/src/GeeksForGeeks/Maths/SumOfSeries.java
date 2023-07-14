package GeeksForGeeks.Maths;

public class SumOfSeries {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(seriesSum(n));
    }

    private static long seriesSum(int n) {
        return (n*(n+1))/2;
    }
}
