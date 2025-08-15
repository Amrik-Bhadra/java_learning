package basics.oops.encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        MyBank a1 = new MyBank("Amrik Bhadra", 1200);
        System.out.println("Current Balance: " + a1.getBalance());
        a1.withdraw(23400.0);
        a1.withdraw(400.0);
        a1.deposit(-45.0);
        a1.deposit(2400.0);
    }
}
