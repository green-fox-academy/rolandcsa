// Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        System.out.println(cities.stream().collect(Collectors.groupingBy(word -> word.charAt(0))));
    }
}
