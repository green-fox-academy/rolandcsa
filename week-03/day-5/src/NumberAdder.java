// Write a recursive function that takes one parameter: n and
// adds numbers from 1 to n.

public class NumberAdder {
    public static void main(String[] args) {
        int sum = numberAdder(3);
        System.out.println(sum);
    }

    public static int numberAdder(int n) {
        if (n == 1) {
            return n;
        }
        return numberAdder(n - 1) + n;
    }
}
