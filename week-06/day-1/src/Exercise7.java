// Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println(findCorrectStrings('N'));
    }

    public static List<String> findCorrectStrings(Character c) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        return cities.stream().filter(x -> x.charAt(0) == c).collect(Collectors.toList());
    }
}
