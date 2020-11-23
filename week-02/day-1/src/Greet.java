//  From now on, create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `al` and assign the value `Green Fox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Green Fox`
// - Greet `al`

import java.util.Scanner;

public class Greet {

    public static void greet() {
        String al = "Green Fox";
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Greetings " + name + ", " + al);

    }

    public static void main(String[] args) {

        greet();
    }
}
