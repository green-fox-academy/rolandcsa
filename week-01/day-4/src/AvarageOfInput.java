import java.util.Scanner;

public class AvarageOfInput {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Input 5 numbers!");
        int num1 = numbers.nextInt();
        int num2 = numbers.nextInt();
        int num3 = numbers.nextInt();
        int num4 = numbers.nextInt();
        int num5 = numbers.nextInt();
        int sum = num1 + num2 + num3 + num4 + num5;
        double avarage = (double) sum / 5;

        System.out.println(sum);
        System.out.println(avarage);

    }
}
