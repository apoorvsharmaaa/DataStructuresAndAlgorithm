package GeeksForGeeks.Arrays;

public class StockBuySell2 {
    public static void main(String[] args) {
        int n = 4;
        int[] a = {3, 4, 1, 5};
        System.out.println(stockBuyAndSell(n, a));
    }

    public static int stockBuyAndSell(int n, int[] prices) {
        int profit = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                profit = profit + (prices[i] - prices[i - 1]);
            }
        }
        return profit;
    }
}
