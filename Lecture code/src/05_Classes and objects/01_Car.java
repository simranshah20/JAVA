class Car{
    //instance variables
        int noOfWheels;
        String color;
        float maxSpeed,currentFuelInLiters;
        int noOfSeats;

        //instance methods
        public void drive(){
            System.out.println("Car is driving");
            currentFuelInLiters--;
        }

        public void addFuel(float fuel){
            currentFuelInLiters += fuel;
        }

        public float getCurrentFuelLevel(){
            return currentFuelInLiters;
        }
}