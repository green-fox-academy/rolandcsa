// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4


import java.util.Scanner;

public class ParametricAvarage {
    public static void main(String[] args) {
        System.out.println("Enter how many numbers do you want to add!");
        Scanner input = new Scanner(System.in);
        int numberOfNumbers = input.nextInt();

        int sum = 0;
        for (int b = 0; b < numberOfNumbers; b++) {
            System.out.println("Enter your numbers");
            int num = input.nextInt();
            sum = sum + num;
        }
        System.out.println(sum);

    }
}





