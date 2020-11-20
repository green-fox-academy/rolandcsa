// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        System.out.println("Input the size of the triangle, please!");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");


        }
    }
}
