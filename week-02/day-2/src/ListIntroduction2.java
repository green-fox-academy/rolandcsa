//Create a list ('List A') which contains the following values
//        Apple, Avocado, Blueberries, Durian, Lychee
//        Create a new list ('List B') with the values of List A
//        Print out whether List A contains Durian or not
//        Remove Durian from List B
//        Add Kiwifruit to List A after the 4th element
//        Compare the size of List A and List B
//        Get the index of Avocado from List A
//        Get the index of Durian from List B
//        Add Passion Fruit and Pomelo to List B in a single statement
//        Print out the 3rd element from List A

import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        A.add("Apple");
        A.add("Avocado");
        A.add("Blueberries");
        A.add("Durian");
        A.add("Lychee");

        ArrayList<String> B = new ArrayList<>();
        B = A;

        System.out.println(A.contains("Durian"));

        B.remove("Durian");
        A.add(3, "Kiwifruit");

        System.out.println(A.indexOf("Avocado"));
        System.out.println(B.indexOf("Durian"));

        B.addAll(Arrays.asList("Passion Fruit", "Pomelo"));
        System.out.println(B);

        System.out.println(A.get(2));
    }
}
