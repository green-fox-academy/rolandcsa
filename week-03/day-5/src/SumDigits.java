// Given a non-negative integer n, return the sum of it's digits recursively
// (without loops).
//
// Hint
//
// Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
//
// Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

public class SumDigits {
    public static void main(String[] args) {
        int sum = sumDigits(126);
        System.out.println(sum);
    }

    public static int sumDigits(int n) {
        int lastDigit = n % 10;
        int nextDigit = n / 10;

        if (nextDigit == 0) {
            return n;
        }
        return sumDigits(nextDigit) + lastDigit;
    }
}

