package basics.inner_classes;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(150);
//        shoppingCart.processPayment(new CreditCard("23212345643"));

        // creating object of implementation class without creating implementing class
        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount){
                System.out.printf("Amount paid! Rs. %.2f using credit card", amount);
            }
        });
    }
}
