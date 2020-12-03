//# Petrol Station
//
//        - Create `Station` and `Car` classes
//        - `Station`
//        - gasAmount
//        - refill(car) -> decreases the gasAmount by the capacity of the car and
//        increases the cars gasAmount
//        - `Car`
//        - gasAmount
//        - capacity
//        - create constructor for `Car` where:
//        - initialize gasAmount -> 0
//        - initialize capacity -> 100

package petrolStation;

public class Main {
    public static void main(String[] args) {
        Car ferrari = new Car();
        Station.refill(ferrari);
        System.out.println("The remaining gas amount of the station is " + Station.gasAmount + ".");
        System.out.println("The car's gas amount is " + ferrari.gasAmount + ".");
    }
}
