// Create a Fox class with 3 properties: name, color and age Fill a list with at least 5 foxes and:
//
//        Write a Stream Expression to find the foxes with green color!
//        Write a Stream Expression to find the foxes with green color, and age less then 5 years!
//        Write a Stream Expression to find the frequency of foxes by color!

package Exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Fox> foxes = new ArrayList<>();

        Fox fox1 = new Fox("Vulpix", "green", 8);
        Fox fox2 = new Fox("Vuk", "red", 10);
        Fox fox3 = new Fox("Jack", "green", 4);
        Fox fox4 = new Fox("Joe", "orange", 5);
        Fox fox5 = new Fox("Jill", "blue", 3);

        foxes.add(fox1);
        foxes.add(fox2);
        foxes.add(fox3);
        foxes.add(fox4);
        foxes.add(fox5);

        foxes.stream()
                .filter(x -> x.getColor().equals("green"))
                .forEach(x -> System.out.println(x.getName()));
        foxes.stream()
                .filter(x -> x.getColor().equals("green"))
                .filter(x -> x.getAge() < 5)
                .forEach(x -> System.out.println(x.getName()));
        System.out.println(foxes.stream()
                .collect(Collectors.groupingBy(Fox::getColor, Collectors.counting())));
    }
}
