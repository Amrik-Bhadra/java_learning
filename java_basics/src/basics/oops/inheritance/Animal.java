package basics.oops.inheritance;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void speak(){
        System.out.println("");
    }

    public void eat(){
        System.out.println("Animal Eats!");
    }

    public String getName(){ return this.name; }
    public int getInt() { return this.age; }
}
