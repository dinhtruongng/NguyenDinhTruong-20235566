import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.name = "Nguyễn Văn A";
        acc.balance = 5000000;
        acc.monthlyInterest = 0.005;
        LocalDate today = LocalDate.now();
        System.out.println("Tạo tài khoản mới: " + acc.name);
        System.out.println("Số dư ban đầu: " + String.valueOf(acc.balance));

        acc.Deposit(1000000, today);
        acc.Withdraw(500000, today.plusDays(1));
        acc.Withdraw(500000, today.plusDays(2));
        acc.Withdraw(500000, today.plusDays(3));
        acc.Withdraw(500000, today.plusDays(4));
        acc.PrintHistory();
        System.out.println("Số dư hiện tại: " + String.valueOf(acc.balance));
        System.out.println("Số dư sau khi cộng lãi: " + String.valueOf(acc.InterestBalance()) + " VND");
    }
}