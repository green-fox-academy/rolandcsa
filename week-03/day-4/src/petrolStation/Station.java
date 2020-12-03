package petrolStation;

public class Station {
    public static int gasAmount = 1000;

    public static void refill(Car newCar) {
        gasAmount = gasAmount - Car.capacity;
        Car.gasAmount = Car.capacity;
    }
}
