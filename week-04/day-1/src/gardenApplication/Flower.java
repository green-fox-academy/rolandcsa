package gardenApplication;

public class Flower extends Plant {
    public Flower(String color) {
        super(color);
    }

    @Override
    public boolean needsWater() {
        return waterLevel < 5;
    }

    @Override
    public String getType() {
        return "Flower";
    }

    @Override
    public double getAbsorptionRate() {
        return 0.75;
    }
}
