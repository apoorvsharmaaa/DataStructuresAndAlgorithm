package Leetcode.JavaBasic;
import java.util.Random;
import java.util.Scanner;
public class RockPaaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock , 1 for paper and  2 for scissors");
        int userinput = sc.nextInt();
        Random rand = new Random();
        int computerinput = rand.nextInt(3);
        System.out.println(computerinput);
        if (computerinput==userinput){
            System.out.println("TIE");
        } else if (computerinput==0&&userinput==1||computerinput==1&&userinput==2||computerinput==2&&userinput==0) {
            System.out.println("You won");
        } else {
            System.out.println("You loose");
        }

    }
}
