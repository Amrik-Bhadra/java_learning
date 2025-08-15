package basics.oops;

public class ConstructorDemo {
    int num;
    public ConstructorDemo(){
        System.out.println("Default Constructor called!");
    }
    public ConstructorDemo(int x){
        System.out.println("Parameterised constructor called! " + x);
        num = x;
    }

    public  ConstructorDemo(int x, int y){
        System.out.println("Constructor overloading!! " + x + y);
    }

    public ConstructorDemo(ConstructorDemo c){
        this(c.num);
        System.out.println("Copy constructor called!");
    }

    public void display(){
        System.out.println("Number is: " + num);
    }

    public static void main(String[] args) {
        ConstructorDemo ob = new ConstructorDemo();
        ConstructorDemo ob2 = new ConstructorDemo(34);
        ConstructorDemo ob3 = new ConstructorDemo(1, 2);

        ConstructorDemo ob4 = new ConstructorDemo(ob2);
        ConstructorDemo ob5 = ob2;
        ob2.display(); // 34
        ob4.display(); // 34
        ob5.display(); // 34

        ob2.num = 5;

        System.out.println("---------------------------");
        ob2.display();  // 2
        ob4.display();  // 34
        ob5.display();  // 5

    }
}
