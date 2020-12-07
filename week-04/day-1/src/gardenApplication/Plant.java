package gardenApplication;

public class Plant {
    protected Integer waterLevel = 0;
    protected String color;

    public Plant(String color) {
        this.color = color;
    }

    public boolean needsWater() {
        return false;
    }

    public void info() {
        if (needsWater()) {
            System.out.println("The " + color + " " + getType() + " needs water");
        } else {
            System.out.println("The " + color + " " + getType() + " doesnt need water");
        }
    }

    public String getType() {
        return "Plant";
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    public double getAbsorptionRate() {
        return 0;
    }
}

