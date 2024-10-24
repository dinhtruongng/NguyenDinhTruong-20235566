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
        String str_amount = String.valueOf(amount);
        String[] add = {"Deposit", str_amount, date};
        history.add(add[0] + " - " + add[1] + " - " + add[2]);
    }
    public void Withdraw(double amount, String date) {
        balance = balance - amount;
        
    }

    public void PrintHistory() {
        for (i=0; i<history.size(); i++) {
            System.out.println(history[i]);
        }
    }

    public void InterestBalance() {
        double month_int = balance * monthlyInterest;
        balance = balance + month_int;
    }

}
