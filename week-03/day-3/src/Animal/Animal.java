package Animal;

public class Animal {
    public static int hunger;
    public static int thirst;

    public Animal() {
        hunger = 50;
        thirst = 50;
    }

    public static void eat() {
        hunger--;
    }

    public static void drink() {
        thirst--;
    }

    public static void play() {
        hunger++;
        thirst++;
    }
}