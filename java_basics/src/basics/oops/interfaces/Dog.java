package basics.oops.interfaces;

public class Dog implements Animal {
    @Override
    public void sleep(){
        System.out.println("Dog sleeps");
    }

    public void eat(){
        System.out.println("Dog eats");
    }
}
