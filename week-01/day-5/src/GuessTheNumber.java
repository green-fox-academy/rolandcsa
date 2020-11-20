// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int storednum = 8;
        System.out.println("Guess the number!");
        Scanner input = new Scanner(System.in);
        int guessednum = input.nextInt();

        if (guessednum > storednum) {
            System.out.println("The stored number is lower");
        } else if (guessednum < storednum) {
            System.out.println("The stored number is higher");
        } else {
            System.out.println("You found the number: 8");
        }
    }
}
