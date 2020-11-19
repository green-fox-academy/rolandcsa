import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Input a number, please!");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
