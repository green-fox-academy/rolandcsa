public class Cuboid {
    public static void main(String[] args) {
        double lenght = 10;
        double width = 5;
        double height = 15;

        double surfaceArea = (2 * lenght * width) + (2 * lenght * height) + (2 * width * height);
        double volume = lenght * width * height;

        System.out.println(surfaceArea);
        System.out.println(volume);
    }
}
