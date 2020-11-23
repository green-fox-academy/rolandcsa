// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`

import java.util.Scanner;

public class Doubling {

    public static void doubling() {
        int baseNum = 123;
        baseNum = baseNum * 2;
        System.out.println(baseNum);


    }

    public static void main(String[] args) {
        int baseNum = 123;
        doubling();
    }
}
