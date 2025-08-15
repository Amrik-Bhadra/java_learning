package basics.oops.static_final;

class Car{
    private static final int noOfWheels = 4;  // it becomes constant and cannot be changed if initialised once

    public void accelerate(){
        System.out.println("Car Accelerates");
    }

    public void deaccelerate(){
        System.out.println("Car De-accelerates");
    }

    // cannot override it in subclasses
    public final void airBags(){
        System.out.println("4 airbags opened");
    }
}

class EVCar extends Car{
    @Override
    public void accelerate(){
        System.out.println("Audi accelerates");
    }
}

public class FinalKeyword_Demo {
    public static void main(String[] args) {

    }
}
