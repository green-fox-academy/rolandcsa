// We have bunnies standing in a line,
// numbered 1, 2, 3, 4, ...
// The odd bunnies (1, 3, ...) have the normal 2 ears.
// The even bunnies (2, 4, ..) we'll say have 3 ears,
// because they each have a raised foot.
// Recursively return the number of "ears" in
// the bunny line 1, 2, ... n (without loops or multiplication).

public class BunniesAgain {
    public static void main(String[] args) {
        int sum = numberOfEars(4);
        System.out.println(sum);
    }

    public static int numberOfEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 == 0) {
            return numberOfEars(bunnies - 1) + 3;
        }
        return numberOfEars(bunnies - 1) + 2;
    }
}
