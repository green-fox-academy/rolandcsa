// Write a Stream Expression to find the frequency of characters in a given string!

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {
        String s = "Hello";

        Map<Character, Long> map = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
