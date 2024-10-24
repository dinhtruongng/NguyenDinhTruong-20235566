import java.util.ArrayList;

public class BankAccount {
    public String name;
    public double balance;
    public double monthlyInterest;
    ArrayList<String> history = new ArrayList<>();

    public double CheckBalance() {
        return balance;
    }
    public void Deposit(double amount, String date) {
        balance = balance + amount;
        history.add("Deposit - " + amount + " - " + date);
    }
    public void Withdraw(double amount, String date) {
        balance = balance - amount;
        
    }

}
