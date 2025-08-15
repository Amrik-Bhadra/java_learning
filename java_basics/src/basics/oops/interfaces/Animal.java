package basics.oops.interfaces;

public interface Animal {
    public static final int MAX_AGE = 80;
    public void sleep();
    public void eat();

    // can be accessed by interface only; Not by instances of classes implementing the interface
    public static void info(){
        System.out.println("Animal Interface");
    }

    // cannot be accessed by interface, and instances of classes implementing the interface
    public default void run(){
        System.out.println("Running");
    }
}

