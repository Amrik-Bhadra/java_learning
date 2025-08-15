package basics.inner_classes;

public class NestedStaticInnerClass {
    public static void main(String[] args) {
        Computer computer = new Computer("Asus", "Vivobook S15", "Windows");
        computer.getOs().displayInfo();

        Computer.USB usb1 = new Computer.USB("Type-C");
        Computer.USB usb2 = new Computer.USB("Type-B");
    }
}
