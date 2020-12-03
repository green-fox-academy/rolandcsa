package petrolStation;

public class Main {
    public static void main(String[] args) {
        Car ferrari = new Car();
        Station.refill(ferrari);
        System.out.println("The remaining gas amount of the station is " + Station.gasAmount + ".");
        System.out.println("The car's gas amount is " + ferrari.gasAmount + ".");
    }
}
