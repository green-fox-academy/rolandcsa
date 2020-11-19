import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        System.out.println("Input a number, please!");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        if (num == 0) {
            System.out.println("Not enough!");
        } else if (num == 1) {
            System.out.println("One");
        } else if (num == 2) {
            System.out.println("Two");
        } else {
            System.out.println("A lot");
        }
    }
}

