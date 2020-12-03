package sharpieSet;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    private static List<Sharpie> list = new ArrayList<>();

    public static void addSharpie() {
        list.add(new Sharpie("", 0));
    }

    public static void countUsable() {
        System.out.println("Usable sharpies: " + list.size());
    }


    public static void removeTrash() {
        for (int i = 0; i < list.size(); i++) {
            if (Sharpie.inkAmount == 0) {
                list.remove(i);
            }
        }
    }
}
