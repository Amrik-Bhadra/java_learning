package basics.inner_classes;

public class Computer {
    private String brand;
    private String model;

    private OperatingSystem os;
    public Computer(String brand, String model, String osName){
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    static class USB{
        private String type;
        public USB(String type){
            this.type = type;
        }
    }

    public OperatingSystem getOs(){
        return os;
    }

    class OperatingSystem{
        private String osName;
        public OperatingSystem(String osName){
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println(String.format("Computer Model %s,  Os %s", model, os));
        }
    }
}
