package in.kgcoding.utils;

import in.kgcoding.geometry.Circle;
import in.kgcoding.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(34,22);

        double circleArea = Math.pow(cir.radius, 2);
        double rectangleArea = rect.length * rect.breadth;

        System.out.println("Area of the circle is: "+circleArea);
        System.out.println("Area of Rectangle is: "+rectangleArea);
    }
}
