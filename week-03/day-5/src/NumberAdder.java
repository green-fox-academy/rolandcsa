// Write a recursive function that takes one parameter: n and
// adds numbers from 1 to n.

public class NumberAdder {
    public static void main(String[] args) {
        numberAdder(3);
    }

    public static void numberAdder(int n) {
        if (n > 1) {
            numberAdder(n - 1);
        }
        System.out.println(n);
    }
}
