package Leetcode.DSA_Leetcode;

public class Leetcode121 {
    public static void main(String[] args) {
        int [] prices =  {1,2,3};
        System.out.println(maxProfit(prices));

    }

    private static int maxProfit(int[] prices) {
        int minimum=prices[0];
        int maxprofit=0;
        for(int price:prices){
            minimum=Math.min(minimum,price);
            maxprofit=Math.max(maxprofit,minimum);
        }
        return maxprofit-minimum;
    }
}

//    }
//        int a = 0;
//        int c = prices[0];
//        for (int i = 0; i < prices.length; i++) {
//            if (c > prices[i]) {
//                c = prices[i];
//            }
//        }
//        if (c==prices[prices.length-1]){
//            return 0;
//        }
//        else {
//            for (int i = c;i<prices.length-1;i++) {
//                if (a < prices[i]) {
//                    a = prices[i];
//                }
//            }
//        }
//        return a-c;
//    }
//}


//    int c = 0;
//        for (int elements : arr) {
//                if (c < elements) {
//        c = elements;
//        }
//
//        }
//        return c;
//        }

