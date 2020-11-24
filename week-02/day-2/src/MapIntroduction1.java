//We are going to play with maps. Feel free to use the built-in methods where possible.
//
//        Create an empty map where the keys are integers and the values are characters
//
//        Print out whether the map is empty or not
//
//        Add the following key-value pairs to the map
//
//        Key	Value
//        97	a
//        98	b
//        99	c
//        65	A
//        66	B
//        67	C
//        Print all the keys
//
//        Print all the values
//
//        Add value D with the key 68
//
//        Print how many key-value pairs are in the map
//
//        Print the value that is associated with key 99
//
//        Remove the key-value pair where with key 97
//
//        Print whether there is an associated value with key 100 or not
//
//        Remove all the key-value pairs

import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[] args) {
        HashMap<Integer, Character> map = new HashMap<>();
        System.out.println(map.isEmpty());
        map.put(97, 'a');
        map.put(98, 'b');
        map.put(99, 'c');
        map.put(65, 'A');
        map.put(66, 'B');
        map.put(67, 'C');
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.put(68, 'D');
        System.out.println(map.size());
        System.out.println(map.get(99));
        map.remove(97);
        System.out.println(map.get(100));
        map.clear();

        System.out.println(map.get(98));
    }
}
