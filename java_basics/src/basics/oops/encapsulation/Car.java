package basics.oops.encapsulation;

public class Car {
    private String color, brand, model;
    private int year, speed, topSpeed;

    public Car(String brand, String model, String color, int year, int topSpeed){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.topSpeed = topSpeed;
    }

    public int getSpeed() { return speed; }

    public void start(){
        this.speed = 0;
    }

    public void accelerate(int increment){
        if(speed + increment < topSpeed){
           this.speed += increment;
        }
    }

    public void brake(int decrement){
        if(speed - decrement > 0){
            this.speed -= decrement;
        }
    }
}
