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
