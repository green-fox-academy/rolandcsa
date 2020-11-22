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

        int i = 1;
        while (i <= row) {
            int space = 1;
            while (space <= row - i + 1) {
                System.out.print(" ");
                space++;
            }
            int star = 1;
            while (star <= i * 2 - 1) {
                System.out.print("*");
                star++;
            }
            System.out.println("");
            i++;
        }


//        for (int i = 1; i <= row; i++) {
//            for (int space = 1; space <= row - i + 1; space++) {
//                System.out.print(" ");
//
//
//            }
//            for (int star = 1; star <= i * 2 - 1; star++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
    }
}
