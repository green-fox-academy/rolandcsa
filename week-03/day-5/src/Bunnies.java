// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears
// across all the bunnies recursively (without loops or multiplication).

public class Bunnies {
    public static void main(String[] args) {
        int sum = numberOfEars(8);
        System.out.println(sum);
    }
    public static int numberOfEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return numberOfEars(bunnies - 1) + 2;
    }
}
