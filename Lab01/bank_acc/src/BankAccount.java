import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.time.Month;

public class BankAccount {
    public String name;
    public double balance;
    public double monthlyInterest;
    ArrayList<String> history = new ArrayList<>();
    public List<LocalDate> withdr_dates = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public double CheckBalance() {
        return balance;
    }

    public void Deposit(double amount, LocalDate date) {
        balance = balance + amount;
        String str_amount = String.valueOf(amount);
        String[] add = {"Deposit", str_amount, date.format(formatter)};
        history.add(add[0] + " - " + add[1] + " - " + add[2]);
        System.out.println("Đã gửi " + str_amount + " VND");
    }
    public void Withdraw(double amount, LocalDate date) {
        if (amount>balance) {
            System.out.println("Insufficient Balance");
        }
        if (n_withdr_monthly(date)>3) {
            System.out.println("Limit reached");
        }
        balance = balance - amount;
        withdr_dates.add(date);
        String[] add = {"Withdraw", String.valueOf(amount), date.format(formatter)};
        history.add(add[0] + " - " + add[1] + " - " + add[2]);
        System.out.println("Đã rút " + String.valueOf(amount) + " VND");
    }
    public int n_withdr_monthly(LocalDate date) {
        int count = 0;
        Month c_month = date.getMonth();
        int c_year = date.getYear();
        for (LocalDate withdrawalDate : withdr_dates) {
            if (withdrawalDate.getMonth() == c_month && withdrawalDate.getYear() == c_year) {
                count=count+1;
            }
        }
        return count;
    }


    public void PrintHistory() {
        System.out.println("Lịch sử giao dịch: ");
        for (int i=0; i<history.size(); i++) {
            int index = i+1;
            String id = String.valueOf(index);
            System.out.println(id + ". " + history.get(i));
        }
    }

    public double InterestBalance() {
        double month_int = balance * monthlyInterest;
        balance = balance + month_int;
        return balance;
    }

}
