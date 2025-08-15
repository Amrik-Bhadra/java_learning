package basics.inner_classes;

public class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    // here this class act as member of class Car
    // using Car class object we can create object of Engine class
    class Engine{
        void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println(model + " engine started.");
            }else{
                System.out.println(model + " engine already on.");
            }
        }

        void stop(){
            if(isEngineOn){
                isEngineOn = false;
                System.out.println(model + " engine stopped.");
            }else{
                System.out.println(model + " engine already stopped.");
            }
        }
    }
}
