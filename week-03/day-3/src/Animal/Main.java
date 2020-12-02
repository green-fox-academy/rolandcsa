package Animal;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        System.out.println("Hunger: " + dog.hunger);
        System.out.println("Thirst: " + dog.thirst);

        dog.eat();
        System.out.println("Hunger: " + dog.hunger);
        dog.drink();
        System.out.println("Thirst: " + dog.thirst);
        dog.play();
        System.out.println("Hunger: " + dog.hunger);
        System.out.println("Thirst: " + dog.thirst);
    }
}
