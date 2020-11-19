import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        System.out.println("How many chickens do you have?");
        Scanner animalNumber = new Scanner(System.in);
        int chickenLegs = animalNumber.nextInt() * 2;
        System.out.println("How many pigs do you have?");
        int pigLegs = animalNumber.nextInt() * 4;
        int sumLegs = chickenLegs + pigLegs;


        System.out.println(sumLegs);
    }
}
