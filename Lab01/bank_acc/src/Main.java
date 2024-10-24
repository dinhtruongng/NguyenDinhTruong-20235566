import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.name = "Nguyễn Văn A";
        acc.balance = 5000000;
        acc.monthlyInterest = 0.005;
        System.out.println("Tạo tài khoản mới: " + acc.name);
        System.out.println("Số dư ban đầu: " + String.valueOf(acc.balance));

        acc.Deposit(1000000, LocalDate.now());
    }
}