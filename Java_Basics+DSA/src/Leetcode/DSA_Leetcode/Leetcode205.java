package Leetcode.DSA_Leetcode;

public class Leetcode205 {
    public static void main(String[] args) {
//        int a = 9;
//        int n  = 2;
//        a -= n;
//        String p ="456123";
//        for (int i=p.length()-1;i>=0;i--)
//        System.out.println(p.charAt(i));
//        System.out.println(n);
//    }
//}
//      int I     =         1;
//      int V     =         5;
//      int X       =      10;
//      int L       =      50;
//      int C       =      100;
//      int D       =      500;
//      int M       =      1000;
//      for ()
        String s = "IX";
        System.out.println(romanToInt(s));
    }
    static int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) {
                ans -= num;
            }
            else{
                ans += num;
            }
        }
        return ans;
    }
}
