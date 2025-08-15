package basics.oops.static_final;

class SingletonExample{
    private static SingletonExample instance;
    private SingletonExample(){
        System.out.println("Private constructor"); // so that no one can call from outside
    }

    public static SingletonExample getInstance(){
        if(instance == null){
            instance = new SingletonExample();
        }

        return instance;
    }
}

public class SingletonClass_Demo {
    public static void main(String[] args) {
//        Car car = Car.getInstance();
    }
}
