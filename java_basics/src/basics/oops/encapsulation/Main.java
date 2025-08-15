package basics.oops.encapsulation;

import basics.oops.encapsulation.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("bmw", "m5", "maroon", 2025, 240);
        car.start();
        car.accelerate(4);
        System.out.println(car.getSpeed());
    }
}
