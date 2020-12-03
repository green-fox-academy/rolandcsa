//# Sharpie Set
//
//        - Reuse your `Sharpie` class
//- Create `SharpieSet` class
//  - it contains a list of Sharpie
//          - countUsable() -> sharpie is usable if it has ink in it
//          - removeTrash() -> removes all unusable sharpies

package sharpieSet;

public class Main {
    public static void main(String[] args) {
        SharpieSet.addSharpie();
        for (int i = 0; i < 100; i++) {
            Sharpie.use();
        }
        SharpieSet.removeTrash();
        SharpieSet.countUsable();
    }
}
