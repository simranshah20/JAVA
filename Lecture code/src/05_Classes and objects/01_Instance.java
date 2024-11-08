class Instance {
    // Instance variables to represent the car's properties
    int noOfWheels;                  // Number of wheels (e.g., 4 for a car)
    String color;                    // Color of the vehicle
    float maxSpeed;                  // Maximum speed the vehicle can reach
    float currentFuelInLiters;       // Current fuel level in liters
    int noOfSeats;                   // Number of seats in the vehicle

    //Instance methods
    // Method to simulate driving the car
    public void drive() {
        System.out.println("Car is driving");
        currentFuelInLiters--;       // Reduces the fuel level by 1 liter after driving
    }

    // Method to add fuel to the car's fuel tank
    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters; // Adds specified liters to current fuel level
        // 'this' refers to the current object's instance variable, to avoid ambiguity
    }

    // Method to retrieve the current fuel level
    public float getCurrentFuelLevel() {
        return currentFuelInLiters;  // Returns the amount of fuel left in the tank
    }
}
