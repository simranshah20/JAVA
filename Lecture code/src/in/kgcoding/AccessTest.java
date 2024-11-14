package in.kgcoding;

public class AccessTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Red";
        car.model = "Swift";
        car.costOfPurchage = 126567;
        System.out.println(car);

        Car newCar = new Car("Black" , "BMW" , 1 , 450000);
        System.out.println(newCar);

       Default dft = new Default();
    }
}
