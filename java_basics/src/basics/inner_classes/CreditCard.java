package basics.inner_classes;

public class CreditCard implements Payment {
    public CreditCard(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    private String creditCardNumber;
    @Override
    public void pay(double amount){
        System.out.printf("Amount paid! Rs. %.2f using credit card", amount);
    }
}
