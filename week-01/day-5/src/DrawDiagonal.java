// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        System.out.println("Enter the size of the diagonal, please!");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {
            System.out.print("%");
        }
        System.out.println("");

        for (int i = 2; i <= row - 1; i++) {
            for (int j = 1; j <= row; j++) {
                if (j == row || j == 1 || j == i) {
                    System.out.print("%");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = 1; i <= row; i++) {
            System.out.print("%");
        }


    }
}
