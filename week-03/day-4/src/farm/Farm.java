package farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    public static List<Animal> list = new ArrayList<>();
    public static int slots = 5;

    public static void breed() {
        if (slots > 0) {
            list.add(new Animal());
        }
    }

    public static void slaughter() {
        int max = Integer.MIN_VALUE;
        int indexOfMax = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).hunger > max) {
                max = list.get(i).hunger;
                indexOfMax = i;
            }
        }
        list.remove(indexOfMax);
    }
}



