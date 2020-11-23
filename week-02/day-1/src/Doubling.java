// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`

import java.util.Scanner;

public class Doubling {

    public static int doubling() {
        System.out.println("Enter a number!");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        number = number * 2;
        System.out.println(number);


        return number;
    }

    public static int doubling2(int baseNum) {
        baseNum = baseNum * 2;
        return baseNum;
    }

    public static void main(String[] args) {
        int baseNum = 123;
        doubling();
        System.out.println(doubling2(baseNum));
    }
}
