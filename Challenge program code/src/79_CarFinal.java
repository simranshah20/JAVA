class CarFinal {
    // Final instance variables for the car's properties
    final int noOfWheels;
    final String model;
    final String engineInLiters;

    // Constructor to initialize final variables
    public CarFinal(String model, int noOfWheels, String engineInLiters) {
        this.model = model;
        this.noOfWheels = noOfWheels;
        this.engineInLiters = engineInLiters;
    }

    // Method to display the car's details
    void displayCarInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Number of Wheels: " + noOfWheels);
        System.out.println("Engine Capacity: " + engineInLiters);
    }

    // Main method to create CarFinal objects and display their information
    public static void main(String[] args) {
        // Create CarFinal objects with specific details
        CarFinal car1 = new CarFinal("Sedan", 4, "2.0L");
        CarFinal car2 = new CarFinal("SUV", 4, "3.5L");

        // Display information of each car
        car1.displayCarInfo();
        System.out.println();
        car2.displayCarInfo();
    }
}
