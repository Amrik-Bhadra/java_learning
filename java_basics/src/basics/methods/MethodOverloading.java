package basics.methods;

class Cat{
    private String name;
    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String makeUpperCase(String name){
        return name + " Oggy";
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Cat c = new Cat("Billa");
        System.out.println(c.makeUpperCase(c.getName()));
        System.out.println(c.getName());
    }
}
