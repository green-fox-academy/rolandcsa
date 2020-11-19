public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightinM = 1.78;

        double Bmi = massInKg / (heightinM * heightinM);

        System.out.printf("%.2f", Bmi);

    }
}
