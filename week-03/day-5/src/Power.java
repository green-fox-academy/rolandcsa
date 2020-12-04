// Given base and n that are both 1 or more, compute recursively (no loops) the
// value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power {
    public static void main(String[] args) {
        int result = power(2,4);
        System.out.println(result);
    }
    public static int power(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return power(base, power - 1) * base;
    }
}
