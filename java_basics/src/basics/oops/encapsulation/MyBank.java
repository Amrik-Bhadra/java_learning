package basics.oops.encapsulation;

public class MyBank {
    private static int accnt_no = 202505001;
    private double balance;
    private int accountNumber;
    private String customerName;

    public MyBank(String customerName, double baseAmount){
        this.accountNumber = accnt_no++;
        this.balance = baseAmount;
        this.customerName = customerName;
        System.out.println("Account Created! Account No: " + this.accountNumber);
    }

    public double getBalance(){
        return this.balance;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void withdraw(double amount){
        if(amount < 0) System.out.println("Amount to withdraw can't be negative");
        else{
            if(getBalance() >= amount){
                this.balance -= amount;
                System.out.printf("Amount %.2f Withdrawn Successfully!\nCurrent Balance: %.2f\n", amount, getBalance());
            }else{
                System.out.println("InSufficient Balance!\nCurrent Balance: " + this.balance);
            }
        }
    }

    public void deposit(double amount){
        if(amount < 0) System.out.println("Amount to deposit can't be negative");
        else{
            this.balance += amount;
            System.out.printf("Amount %.2f Deposited Successfully!\nCurrent Balance: %.2f\n", amount, getBalance());
        }
    }
}
