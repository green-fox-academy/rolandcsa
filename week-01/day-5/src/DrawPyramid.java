// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        System.out.println("Enter the size of the pyramid, please!");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int space = 1; space <= i; space++) {

//                Not finished

            }
        }
    }
}
