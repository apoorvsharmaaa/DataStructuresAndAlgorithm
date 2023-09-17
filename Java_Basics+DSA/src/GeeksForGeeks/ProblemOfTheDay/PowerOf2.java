package GeeksForGeeks.ProblemOfTheDay;

public class PowerOf2 {
    public static void main(String[] args) {
        long n = 16;
        System.out.println(ans(n));
    }

    public static boolean ans(long n) {
        if (n == 0){
            return false;
        }
        if (((n) & (n - 1)) == 0){
            return true;
        }
        else{
            return false;
        }
    }
}