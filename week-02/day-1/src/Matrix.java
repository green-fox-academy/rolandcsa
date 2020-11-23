// - Create (dynamically*) a two dimensional array
//   with the following matrix**. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
// * length should depend on a variable
// ** Relax, a matrix is just like an array


import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        System.out.println("Enter the size of the matrix!");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        int[][] numbers = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    numbers[i][j] = 1;

                }


                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
    }
}
