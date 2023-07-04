package Leetcode.JavaBasic;

import java.util.Random;
import java.util.Scanner;

class game {
    public int number;
    public int inputNumber;
    public int numberGuess;

    public int getNumberGuess() {
        return numberGuess;
    }

    public void setNumberGuess(int numberGuess) {
        this.numberGuess = numberGuess;
    }


    game( ) {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.print("Guess the number: ");
        Scanner sc = new Scanner(System.in);
         inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber () {
        if (inputNumber == number) {
            return true;
        } else if (inputNumber > number) {
            System.out.println("Too high...");
        } else if (inputNumber < number) {
            System.out.println("Too low...");
        }
            return false;
    }
}


public class GuessTheRandomNumberGame {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        int count = 0;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
            count = count + 1;
        }
        System.out.println("You took " + count + " numbers of attempts");
    }
}
