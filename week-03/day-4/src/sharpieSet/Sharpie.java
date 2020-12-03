package sharpieSet;

public class Sharpie {
    public static String color;
    public static double width;
    public static double inkAmount;

    public Sharpie(String color, double width) {
        inkAmount = 100;
    }

    public static void use() {
        inkAmount--;
    }
}
