package GeeksForGeeks.ProblemOfTheDay;

import java.math.BigInteger;

public class MultiplyTwoString {
    public static void main(String[] args) {
      String  s1 = "0033";
      String  s2 = "2";
        System.out.println(multiplyStrings(s1,s2));

    }
    public static String multiplyStrings(String s1,String s2)
    {
    BigInteger a = new BigInteger(s1);
    BigInteger b = new BigInteger(s2);
    b=b.multiply(a);
       return b.toString();
}

}
