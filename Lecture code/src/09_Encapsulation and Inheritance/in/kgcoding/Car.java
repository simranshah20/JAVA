package in.kgcoding;

public class Car {
    public String color,model;
    private double fuelLevel;
    long costOfPurchage;

    public Car(String color, String model, double fuelLevel, long costOfPurchage) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchage = costOfPurchage;
    }

    public Car(){

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", costOfPurchage=" + costOfPurchage +
                '}';
    }
}
