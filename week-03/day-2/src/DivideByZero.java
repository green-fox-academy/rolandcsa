// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        divideWithTen();
    }

    private static void divideWithTen() {
        System.out.println("Please input a number!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double result = (double) number / 10;

        if (result == 0) {
            System.err.println("fail");
        } else {
            System.out.println(result);
        }
    }
}
