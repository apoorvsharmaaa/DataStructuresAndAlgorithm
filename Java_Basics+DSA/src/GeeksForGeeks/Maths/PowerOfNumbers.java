package GeeksForGeeks.Maths;

public class PowerOfNumbers {
    public static void main(String[] args) {
        int  N = 12;
        int R = 21;
        System.out.println(power(N, R));
    }
    public static int power(int N,int R){
        if(R==1){
            return N;
        }
        long temp = power(N,R/2)%1000000007;
        long res = (temp*temp)%1000000007;
        if(R%2==0){
            return (int) res;
        }
        else return (int) ((res*N)%1000000007);
    }

}
