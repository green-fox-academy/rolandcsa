import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        System.out.println("How many chickens do you have?");
        Scanner chickens = new Scanner(System.in);
        System.out.println("How many pigs do you have?");
        Scanner pigs = new Scanner(System.in);
        int chickenLegs = chickens.nextInt() * 2;
        int pigLegs = chickens.nextInt() * 4;
        int sumLegs = chickenLegs + pigLegs;


        System.out.println(sumLegs);
    }
}
