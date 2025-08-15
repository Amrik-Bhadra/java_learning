package basics.oops.interfaces;

public class Interface_Demo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.MAX_AGE);
        System.out.println(Animal.MAX_AGE);

        Animal.info();
//        dog.info();

        dog.run();
    }
}
