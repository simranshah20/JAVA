package in.kgcoding;

public class AccessTest {
    public static void main(String[] args) {
        in.kgcoding.Car car = new in.kgcoding.Car();
        car.color = "Red";
        car.model = "Swift";
        car.costOfPurchage = 126567;
        System.out.println(car);

        in.kgcoding.Car newCar = new in.kgcoding.Car("Black" , "BMW" , 1 , 450000);
        System.out.println(newCar);

       in.kgcoding.Default dft = new in.kgcoding.Default();
    }
}
