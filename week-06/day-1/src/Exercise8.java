// Write a Stream Expression to concatenate a Character list to a string!

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println(s());
    }

    public static String s() {
        List<Character> characters = Arrays.asList('H', 'e', 'l', 'l', 'o');

        return characters.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
