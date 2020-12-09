public class Fibonacci {

    public static void main(String[] args) {
        fibonacci(4);
    }

    public static void fibonacci(int index) {
        int a = 0;
        int b = 1;
        int number = a + b;

        for (int i = 0; i < index - 3; i++) {
            a = number - a;
            b = number;
            number = a + b;
        }
        System.out.println(number);

//        Not finished
    }
}
