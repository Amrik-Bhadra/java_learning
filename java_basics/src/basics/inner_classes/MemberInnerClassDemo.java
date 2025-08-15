package basics.inner_classes;

public class MemberInnerClassDemo {
    public static void main(String[] args) {
        Car car = new Car("Tata Safari");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();
    }
}
