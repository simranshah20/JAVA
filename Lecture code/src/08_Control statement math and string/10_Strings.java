class Car {
    int noOfWheels, noOfDoors, maxSpeed;
    String name, modelNumber, company;

    // Constructor to initialize the Car object with its attributes
    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    // Overridden toString() method to return a string representation of the Car object
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}

class Strings {
    public static void main(String[] args) {
        // Creating a Car object with specific values
        Car swift = new Car(4, 4, 120, "Swift", "SW877", "Maruti");

        // Printing the Car object, which calls the overridden toString() method
        System.out.println(swift.toString());
    }
}