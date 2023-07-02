package com.company2;

public class Leetcode69 {
    public static void main(String[] args) {
        int x = 3;
        int sqrt = mySqrt(x);
        System.out.println(sqrt);
    }

    static int mySqrt(int x) {

        long r = x;
        while (r * r > x)
            r = (r + x / r) / 2;
        return (int) r;
    }
}
//        if(x ==0 || x ==1)
//        {
//            return x;
//        }
//        int start = 0;
//        int end = x;
//        int res =0;
//        while(start<=end)
//        {
//            int mid = start + (end-start)/2;
//            if(mid <= x/mid)
//            {
//                res = mid;
//                start = mid + 1;
//            }
//            else
//            {
//                end = mid - 1;
//            }
//        }
//        return res;
//    }
//}
